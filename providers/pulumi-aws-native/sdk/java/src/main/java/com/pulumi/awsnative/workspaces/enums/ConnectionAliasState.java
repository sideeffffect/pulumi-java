// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.workspaces.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ConnectionAliasState {
        Creating("CREATING"),
        Created("CREATED"),
        Deleting("DELETING");

        private final String value;

        ConnectionAliasState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionAliasState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
