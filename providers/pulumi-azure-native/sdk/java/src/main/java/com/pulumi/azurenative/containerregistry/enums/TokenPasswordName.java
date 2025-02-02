// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The password name &#34;password1&#34; or &#34;password2&#34;
     * 
     */
    @EnumType
    public enum TokenPasswordName {
        Password1("password1"),
        Password2("password2");

        private final String value;

        TokenPasswordName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TokenPasswordName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
