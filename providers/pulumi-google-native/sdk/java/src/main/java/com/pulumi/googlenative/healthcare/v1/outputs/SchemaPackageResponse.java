// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare.v1.outputs.Hl7SchemaConfigResponse;
import com.pulumi.googlenative.healthcare.v1.outputs.Hl7TypesConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SchemaPackageResponse {
    /**
     * @return Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    private final Boolean ignoreMinOccurs;
    /**
     * @return Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    private final List<Hl7SchemaConfigResponse> schemas;
    /**
     * @return Determines how messages that fail to parse are handled.
     * 
     */
    private final String schematizedParsingType;
    /**
     * @return Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    private final List<Hl7TypesConfigResponse> types;
    /**
     * @return Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    private final String unexpectedSegmentHandling;

    @CustomType.Constructor
    private SchemaPackageResponse(
        @CustomType.Parameter("ignoreMinOccurs") Boolean ignoreMinOccurs,
        @CustomType.Parameter("schemas") List<Hl7SchemaConfigResponse> schemas,
        @CustomType.Parameter("schematizedParsingType") String schematizedParsingType,
        @CustomType.Parameter("types") List<Hl7TypesConfigResponse> types,
        @CustomType.Parameter("unexpectedSegmentHandling") String unexpectedSegmentHandling) {
        this.ignoreMinOccurs = ignoreMinOccurs;
        this.schemas = schemas;
        this.schematizedParsingType = schematizedParsingType;
        this.types = types;
        this.unexpectedSegmentHandling = unexpectedSegmentHandling;
    }

    /**
     * @return Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    public Boolean ignoreMinOccurs() {
        return this.ignoreMinOccurs;
    }
    /**
     * @return Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    public List<Hl7SchemaConfigResponse> schemas() {
        return this.schemas;
    }
    /**
     * @return Determines how messages that fail to parse are handled.
     * 
     */
    public String schematizedParsingType() {
        return this.schematizedParsingType;
    }
    /**
     * @return Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    public List<Hl7TypesConfigResponse> types() {
        return this.types;
    }
    /**
     * @return Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    public String unexpectedSegmentHandling() {
        return this.unexpectedSegmentHandling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreMinOccurs;
        private List<Hl7SchemaConfigResponse> schemas;
        private String schematizedParsingType;
        private List<Hl7TypesConfigResponse> types;
        private String unexpectedSegmentHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMinOccurs = defaults.ignoreMinOccurs;
    	      this.schemas = defaults.schemas;
    	      this.schematizedParsingType = defaults.schematizedParsingType;
    	      this.types = defaults.types;
    	      this.unexpectedSegmentHandling = defaults.unexpectedSegmentHandling;
        }

        public Builder ignoreMinOccurs(Boolean ignoreMinOccurs) {
            this.ignoreMinOccurs = Objects.requireNonNull(ignoreMinOccurs);
            return this;
        }
        public Builder schemas(List<Hl7SchemaConfigResponse> schemas) {
            this.schemas = Objects.requireNonNull(schemas);
            return this;
        }
        public Builder schemas(Hl7SchemaConfigResponse... schemas) {
            return schemas(List.of(schemas));
        }
        public Builder schematizedParsingType(String schematizedParsingType) {
            this.schematizedParsingType = Objects.requireNonNull(schematizedParsingType);
            return this;
        }
        public Builder types(List<Hl7TypesConfigResponse> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(Hl7TypesConfigResponse... types) {
            return types(List.of(types));
        }
        public Builder unexpectedSegmentHandling(String unexpectedSegmentHandling) {
            this.unexpectedSegmentHandling = Objects.requireNonNull(unexpectedSegmentHandling);
            return this;
        }        public SchemaPackageResponse build() {
            return new SchemaPackageResponse(ignoreMinOccurs, schemas, schematizedParsingType, types, unexpectedSegmentHandling);
        }
    }
}
