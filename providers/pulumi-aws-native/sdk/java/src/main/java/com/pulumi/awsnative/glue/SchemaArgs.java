// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue;

import com.pulumi.awsnative.glue.enums.SchemaCompatibility;
import com.pulumi.awsnative.glue.enums.SchemaDataFormat;
import com.pulumi.awsnative.glue.inputs.SchemaRegistryArgs;
import com.pulumi.awsnative.glue.inputs.SchemaTagArgs;
import com.pulumi.awsnative.glue.inputs.SchemaVersionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaArgs Empty = new SchemaArgs();

    @Import(name="checkpointVersion")
      private final @Nullable Output<SchemaVersionArgs> checkpointVersion;

    public Output<SchemaVersionArgs> checkpointVersion() {
        return this.checkpointVersion == null ? Codegen.empty() : this.checkpointVersion;
    }

    /**
     * Compatibility setting for the schema.
     * 
     */
    @Import(name="compatibility", required=true)
      private final Output<SchemaCompatibility> compatibility;

    public Output<SchemaCompatibility> compatibility() {
        return this.compatibility;
    }

    /**
     * Data format name to use for the schema. Accepted values: 'AVRO', 'JSON', 'PROTOBUF'
     * 
     */
    @Import(name="dataFormat", required=true)
      private final Output<SchemaDataFormat> dataFormat;

    public Output<SchemaDataFormat> dataFormat() {
        return this.dataFormat;
    }

    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the schema.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="registry")
      private final @Nullable Output<SchemaRegistryArgs> registry;

    public Output<SchemaRegistryArgs> registry() {
        return this.registry == null ? Codegen.empty() : this.registry;
    }

    /**
     * Definition for the initial schema version in plain-text.
     * 
     */
    @Import(name="schemaDefinition", required=true)
      private final Output<String> schemaDefinition;

    public Output<String> schemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * List of tags to tag the schema
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<SchemaTagArgs>> tags;

    public Output<List<SchemaTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SchemaArgs(
        @Nullable Output<SchemaVersionArgs> checkpointVersion,
        Output<SchemaCompatibility> compatibility,
        Output<SchemaDataFormat> dataFormat,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<SchemaRegistryArgs> registry,
        Output<String> schemaDefinition,
        @Nullable Output<List<SchemaTagArgs>> tags) {
        this.checkpointVersion = checkpointVersion;
        this.compatibility = Objects.requireNonNull(compatibility, "expected parameter 'compatibility' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.description = description;
        this.name = name;
        this.registry = registry;
        this.schemaDefinition = Objects.requireNonNull(schemaDefinition, "expected parameter 'schemaDefinition' to be non-null");
        this.tags = tags;
    }

    private SchemaArgs() {
        this.checkpointVersion = Codegen.empty();
        this.compatibility = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.registry = Codegen.empty();
        this.schemaDefinition = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SchemaVersionArgs> checkpointVersion;
        private Output<SchemaCompatibility> compatibility;
        private Output<SchemaDataFormat> dataFormat;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<SchemaRegistryArgs> registry;
        private Output<String> schemaDefinition;
        private @Nullable Output<List<SchemaTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointVersion = defaults.checkpointVersion;
    	      this.compatibility = defaults.compatibility;
    	      this.dataFormat = defaults.dataFormat;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.registry = defaults.registry;
    	      this.schemaDefinition = defaults.schemaDefinition;
    	      this.tags = defaults.tags;
        }

        public Builder checkpointVersion(@Nullable Output<SchemaVersionArgs> checkpointVersion) {
            this.checkpointVersion = checkpointVersion;
            return this;
        }
        public Builder checkpointVersion(@Nullable SchemaVersionArgs checkpointVersion) {
            this.checkpointVersion = Codegen.ofNullable(checkpointVersion);
            return this;
        }
        public Builder compatibility(Output<SchemaCompatibility> compatibility) {
            this.compatibility = Objects.requireNonNull(compatibility);
            return this;
        }
        public Builder compatibility(SchemaCompatibility compatibility) {
            this.compatibility = Output.of(Objects.requireNonNull(compatibility));
            return this;
        }
        public Builder dataFormat(Output<SchemaDataFormat> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }
        public Builder dataFormat(SchemaDataFormat dataFormat) {
            this.dataFormat = Output.of(Objects.requireNonNull(dataFormat));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder registry(@Nullable Output<SchemaRegistryArgs> registry) {
            this.registry = registry;
            return this;
        }
        public Builder registry(@Nullable SchemaRegistryArgs registry) {
            this.registry = Codegen.ofNullable(registry);
            return this;
        }
        public Builder schemaDefinition(Output<String> schemaDefinition) {
            this.schemaDefinition = Objects.requireNonNull(schemaDefinition);
            return this;
        }
        public Builder schemaDefinition(String schemaDefinition) {
            this.schemaDefinition = Output.of(Objects.requireNonNull(schemaDefinition));
            return this;
        }
        public Builder tags(@Nullable Output<List<SchemaTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<SchemaTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(SchemaTagArgs... tags) {
            return tags(List.of(tags));
        }        public SchemaArgs build() {
            return new SchemaArgs(checkpointVersion, compatibility, dataFormat, description, name, registry, schemaDefinition, tags);
        }
    }
}
