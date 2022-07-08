// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The format of packages that are stored in the repository.
     * 
     */
    @EnumType
    public enum RepositoryFormat {
        /**
         * Unspecified package format.
         * 
         */
        FormatUnspecified("FORMAT_UNSPECIFIED"),
        /**
         * Docker package format.
         * 
         */
        Docker("DOCKER"),
        /**
         * Maven package format.
         * 
         */
        Maven("MAVEN"),
        /**
         * NPM package format.
         * 
         */
        Npm("NPM"),
        /**
         * APT package format.
         * 
         */
        Apt("APT"),
        /**
         * YUM package format.
         * 
         */
        Yum("YUM"),
        /**
         * Python package format.
         * 
         */
        Python("PYTHON"),
        /**
         * Kubeflow Pipelines package format.
         * 
         */
        Kfp("KFP");

        private final String value;

        RepositoryFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RepositoryFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
