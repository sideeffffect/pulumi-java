// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics.v1alpha2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of the disk to create.
     * 
     */
    @EnumType
    public enum DiskType {
        /**
         * Default disk type. Use one of the other options below.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Specifies a Google Compute Engine persistent hard disk. See https://cloud.google.com/compute/docs/disks/#pdspecs for details.
         * 
         */
        PersistentHdd("PERSISTENT_HDD"),
        /**
         * Specifies a Google Compute Engine persistent solid-state disk. See https://cloud.google.com/compute/docs/disks/#pdspecs for details.
         * 
         */
        PersistentSsd("PERSISTENT_SSD"),
        /**
         * Specifies a Google Compute Engine local SSD. See https://cloud.google.com/compute/docs/disks/local-ssd for details.
         * 
         */
        LocalSsd("LOCAL_SSD");

        private final String value;

        DiskType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiskType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
