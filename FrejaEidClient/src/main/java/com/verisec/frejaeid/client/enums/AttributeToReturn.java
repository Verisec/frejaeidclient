package com.verisec.frejaeid.client.enums;

import com.verisec.frejaeid.client.beans.general.SsnUserInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Additional information about the user to be returned. Attributes that can be
 * requested:
 * <br> - {@link #BASIC_USER_INFO}
 * <br> - {@link #CUSTOM_IDENTIFIER}
 * <br> - {@link #INTEGRATOR_SPECIFIC_USER_ID}
 * <br> - {@link #SSN}
 * <br> - {@link #DATE_OF_BIRTH}
 * <br> - {@link #RELYING_PARTY_USER_ID}
 * <br> - {@link #EMAIL_ADDRESS}
 * <br> - {@link #ORGANISATION_ID_IDENTIFIER}
 *
 */
public enum AttributeToReturn {

    /**
     * If BASIC_USER_INFO is requested, BasicUserInfo which contains name and
     * surname will be returned and it can be requested only for
     * {@linkplain MinRegistrationLevel#EXTENDED} and
     * {@linkplain MinRegistrationLevel#PLUS}.
     */
    BASIC_USER_INFO("BASIC_USER_INFO"),
    /**
     * Custom identifier can be requested only if it is set previously.
     */
    CUSTOM_IDENTIFIER("CUSTOM_IDENTIFIER"),
    /**
     * Integrator specific user id can be requested only by integrator relying
     * parties.
     */
    INTEGRATOR_SPECIFIC_USER_ID("INTEGRATOR_SPECIFIC_USER_ID"),
    /**
     * If SSN is requested, {@linkplain SsnUserInfo} which contains personal
     * number and country will be returned and it can be requested only for
     * {@linkplain MinRegistrationLevel#EXTENDED} and
     * {@linkplain MinRegistrationLevel#PLUS}.
     */
    SSN("SSN"),
    /**
     * Date of birth can be requested only for
     * {@linkplain MinRegistrationLevel#EXTENDED} and
     * {@linkplain MinRegistrationLevel#PLUS}.
     */
    DATE_OF_BIRTH("DATE_OF_BIRTH"),
    /**
     * Relying party user id is a unique, user-specific value that allows the
     * relying party to identify the same user across multiple sessions.
     */
    RELYING_PARTY_USER_ID("RELYING_PARTY_USER_ID"),
    /**
     * Email address of user.
     */
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    /**
     * Organisation id identifier can be requested only if it is set previously.
     */
    ORGANISATION_ID_IDENTIFIER("ORGANISATION_ID_IDENTIFIER"),
    
    ADDRESSES("ADDRESSES");

    private final String name;

    private static class Holder {

        static Map<String, AttributeToReturn> MAP = new HashMap<>();
    }

    private AttributeToReturn(String name) {
        this.name = name;
        AttributeToReturn.Holder.MAP.put(name, this);
    }

    /**
     * Returns the AttributeToReturn constant of this type with the specified
     * name.
     *
     * @param name The name must match exactly an identifier used to declare an
     * AttributeToReturn constant in this type. (Extraneous whitespace
     * characters are not permitted.)
     * @return The AttributeToReturn constant with the specified name and
     * {@code null} if there is no constant with the specified name.
     */
    public static AttributeToReturn findByName(String name) {
        return AttributeToReturn.Holder.MAP.get(name);
    }

    /**
     * Returns name of the AttributeToReturn constant
     *
     * @return name
     */
    public String getName() {
        return name;
    }

}
