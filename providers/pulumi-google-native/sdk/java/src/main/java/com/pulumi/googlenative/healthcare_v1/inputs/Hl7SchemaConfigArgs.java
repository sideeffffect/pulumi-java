// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.VersionSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Root config message for HL7v2 schema. This contains a schema structure of groups and segments, and filters that determine which messages to apply the schema structure to.
 * 
 */
public final class Hl7SchemaConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7SchemaConfigArgs Empty = new Hl7SchemaConfigArgs();

    /**
     * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
     * 
     */
    @Import(name="messageSchemaConfigs")
    private @Nullable Output<Map<String,String>> messageSchemaConfigs;

    public Optional<Output<Map<String,String>>> messageSchemaConfigs() {
        return Optional.ofNullable(this.messageSchemaConfigs);
    }

    /**
     * Each VersionSource is tested and only if they all match is the schema used for the message.
     * 
     */
    @Import(name="version")
    private @Nullable Output<List<VersionSourceArgs>> version;

    public Optional<Output<List<VersionSourceArgs>>> version() {
        return Optional.ofNullable(this.version);
    }

    private Hl7SchemaConfigArgs() {}

    private Hl7SchemaConfigArgs(Hl7SchemaConfigArgs $) {
        this.messageSchemaConfigs = $.messageSchemaConfigs;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7SchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7SchemaConfigArgs $;

        public Builder() {
            $ = new Hl7SchemaConfigArgs();
        }

        public Builder(Hl7SchemaConfigArgs defaults) {
            $ = new Hl7SchemaConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageSchemaConfigs(@Nullable Output<Map<String,String>> messageSchemaConfigs) {
            $.messageSchemaConfigs = messageSchemaConfigs;
            return this;
        }

        public Builder messageSchemaConfigs(Map<String,String> messageSchemaConfigs) {
            return messageSchemaConfigs(Output.of(messageSchemaConfigs));
        }

        public Builder version(@Nullable Output<List<VersionSourceArgs>> version) {
            $.version = version;
            return this;
        }

        public Builder version(List<VersionSourceArgs> version) {
            return version(Output.of(version));
        }

        public Builder version(VersionSourceArgs... version) {
            return version(List.of(version));
        }

        public Hl7SchemaConfigArgs build() {
            return $;
        }
    }

}
