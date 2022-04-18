// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1.outputs.VersionSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class Hl7SchemaConfigResponse {
    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    private final Map<String,String> messageSchemaConfigs;
    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    private final List<VersionSourceResponse> version;

    @CustomType.Constructor
    private Hl7SchemaConfigResponse(
        @CustomType.Parameter("messageSchemaConfigs") Map<String,String> messageSchemaConfigs,
        @CustomType.Parameter("version") List<VersionSourceResponse> version) {
        this.messageSchemaConfigs = messageSchemaConfigs;
        this.version = version;
    }

    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
    */
    public Map<String,String> messageSchemaConfigs() {
        return this.messageSchemaConfigs;
    }
    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
    */
    public List<VersionSourceResponse> version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> messageSchemaConfigs;
        private List<VersionSourceResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder messageSchemaConfigs(Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs);
            return this;
        }
        public Builder version(List<VersionSourceResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(VersionSourceResponse... version) {
            return version(List.of(version));
        }        public Hl7SchemaConfigResponse build() {
            return new Hl7SchemaConfigResponse(messageSchemaConfigs, version);
        }
    }
}
