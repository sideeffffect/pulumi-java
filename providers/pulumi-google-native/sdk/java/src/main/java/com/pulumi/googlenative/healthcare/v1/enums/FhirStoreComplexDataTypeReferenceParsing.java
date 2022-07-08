// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable parsing of references within complex FHIR data types such as Extensions. If this value is set to ENABLED, then features like referential integrity and Bundle reference rewriting apply to all references. If this flag has not been specified the behavior of the FHIR store will not change, references in complex data types will not be parsed. New stores will have this value set to ENABLED after a notification period. Warning: turning on this flag causes processing existing resources to fail if they contain references to non-existent resources.
     * 
     */
    @EnumType
    public enum FhirStoreComplexDataTypeReferenceParsing {
        /**
         * No parsing behavior specified. This is the same as DISABLED for backwards compatibility.
         * 
         */
        ComplexDataTypeReferenceParsingUnspecified("COMPLEX_DATA_TYPE_REFERENCE_PARSING_UNSPECIFIED"),
        /**
         * References in complex data types are ignored.
         * 
         */
        Disabled("DISABLED"),
        /**
         * References in complex data types are parsed.
         * 
         */
        Enabled("ENABLED");

        private final String value;

        FhirStoreComplexDataTypeReferenceParsing(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FhirStoreComplexDataTypeReferenceParsing[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
