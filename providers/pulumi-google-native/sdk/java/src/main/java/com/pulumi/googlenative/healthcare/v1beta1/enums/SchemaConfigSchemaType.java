// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the output schema type. Schema type is required.
     * 
     */
    @EnumType
    public enum SchemaConfigSchemaType {
        /**
         * No schema type specified. This type is unsupported.
         * 
         */
        SchemaTypeUnspecified("SCHEMA_TYPE_UNSPECIFIED"),
        /**
         * A data-driven schema generated from the fields present in the FHIR data being exported, with no additional simplification.
         * 
         */
        Lossless("LOSSLESS"),
        /**
         * Analytics schema defined by the FHIR community. See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md. BigQuery only allows a maximum of 10,000 columns per table. Due to this limitation, the server will not generate schemas for fields of type `Resource`, which can hold any resource type. The affected fields are `Parameters.parameter.resource`, `Bundle.entry.resource`, and `Bundle.entry.response.outcome`.
         * 
         */
        Analytics("ANALYTICS"),
        /**
         * Analytics V2, similar to schema defined by the FHIR community, with added support for extensions with one or more occurrences and contained resources in stringified JSON.
         * 
         */
        AnalyticsV2("ANALYTICS_V2");

        private final String value;

        SchemaConfigSchemaType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchemaConfigSchemaType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
