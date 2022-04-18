// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of identity used for the image template. The type 'None' will remove any identities from the image template.
     * 
     */
    @EnumType
    public enum ResourceIdentityType {
        UserAssigned("UserAssigned"),
        None("None");

        private final String value;

        ResourceIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
