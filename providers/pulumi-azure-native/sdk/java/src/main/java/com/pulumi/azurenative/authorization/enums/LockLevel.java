// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can&#39;t modify or delete it.
     * 
     */
    @EnumType
    public enum LockLevel {
        NotSpecified("NotSpecified"),
        CanNotDelete("CanNotDelete"),
        ReadOnly("ReadOnly");

        private final String value;

        LockLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LockLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
