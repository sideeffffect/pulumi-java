// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaState Empty = new SchemaState();

    /**
     * Amazon Resource Name (ARN) of the schema.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The compatibility mode of the schema. Values values are: `NONE`, `DISABLED`, `BACKWARD`, `BACKWARD_ALL`, `FORWARD`, `FORWARD_ALL`, `FULL`, and `FULL_ALL`.
     * 
     */
    @Import(name="compatibility")
      private final @Nullable Output<String> compatibility;

    public Output<String> compatibility() {
        return this.compatibility == null ? Codegen.empty() : this.compatibility;
    }

    /**
     * The data format of the schema definition. Valid values are `AVRO` and `JSON`.
     * 
     */
    @Import(name="dataFormat")
      private final @Nullable Output<String> dataFormat;

    public Output<String> dataFormat() {
        return this.dataFormat == null ? Codegen.empty() : this.dataFormat;
    }

    /**
     * A description of the schema.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The latest version of the schema associated with the returned schema definition.
     * 
     */
    @Import(name="latestSchemaVersion")
      private final @Nullable Output<Integer> latestSchemaVersion;

    public Output<Integer> latestSchemaVersion() {
        return this.latestSchemaVersion == null ? Codegen.empty() : this.latestSchemaVersion;
    }

    /**
     * The next version of the schema associated with the returned schema definition.
     * 
     */
    @Import(name="nextSchemaVersion")
      private final @Nullable Output<Integer> nextSchemaVersion;

    public Output<Integer> nextSchemaVersion() {
        return this.nextSchemaVersion == null ? Codegen.empty() : this.nextSchemaVersion;
    }

    /**
     * The ARN of the Glue Registry to create the schema in.
     * 
     */
    @Import(name="registryArn")
      private final @Nullable Output<String> registryArn;

    public Output<String> registryArn() {
        return this.registryArn == null ? Codegen.empty() : this.registryArn;
    }

    /**
     * The name of the Glue Registry.
     * 
     */
    @Import(name="registryName")
      private final @Nullable Output<String> registryName;

    public Output<String> registryName() {
        return this.registryName == null ? Codegen.empty() : this.registryName;
    }

    /**
     * The version number of the checkpoint (the last time the compatibility mode was changed).
     * 
     */
    @Import(name="schemaCheckpoint")
      private final @Nullable Output<Integer> schemaCheckpoint;

    public Output<Integer> schemaCheckpoint() {
        return this.schemaCheckpoint == null ? Codegen.empty() : this.schemaCheckpoint;
    }

    /**
     * The schema definition using the `data_format` setting for `schema_name`.
     * 
     */
    @Import(name="schemaDefinition")
      private final @Nullable Output<String> schemaDefinition;

    public Output<String> schemaDefinition() {
        return this.schemaDefinition == null ? Codegen.empty() : this.schemaDefinition;
    }

    /**
     * The Name of the schema.
     * 
     */
    @Import(name="schemaName")
      private final @Nullable Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName == null ? Codegen.empty() : this.schemaName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public SchemaState(
        @Nullable Output<String> arn,
        @Nullable Output<String> compatibility,
        @Nullable Output<String> dataFormat,
        @Nullable Output<String> description,
        @Nullable Output<Integer> latestSchemaVersion,
        @Nullable Output<Integer> nextSchemaVersion,
        @Nullable Output<String> registryArn,
        @Nullable Output<String> registryName,
        @Nullable Output<Integer> schemaCheckpoint,
        @Nullable Output<String> schemaDefinition,
        @Nullable Output<String> schemaName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.compatibility = compatibility;
        this.dataFormat = dataFormat;
        this.description = description;
        this.latestSchemaVersion = latestSchemaVersion;
        this.nextSchemaVersion = nextSchemaVersion;
        this.registryArn = registryArn;
        this.registryName = registryName;
        this.schemaCheckpoint = schemaCheckpoint;
        this.schemaDefinition = schemaDefinition;
        this.schemaName = schemaName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private SchemaState() {
        this.arn = Codegen.empty();
        this.compatibility = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.description = Codegen.empty();
        this.latestSchemaVersion = Codegen.empty();
        this.nextSchemaVersion = Codegen.empty();
        this.registryArn = Codegen.empty();
        this.registryName = Codegen.empty();
        this.schemaCheckpoint = Codegen.empty();
        this.schemaDefinition = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> compatibility;
        private @Nullable Output<String> dataFormat;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> latestSchemaVersion;
        private @Nullable Output<Integer> nextSchemaVersion;
        private @Nullable Output<String> registryArn;
        private @Nullable Output<String> registryName;
        private @Nullable Output<Integer> schemaCheckpoint;
        private @Nullable Output<String> schemaDefinition;
        private @Nullable Output<String> schemaName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.compatibility = defaults.compatibility;
    	      this.dataFormat = defaults.dataFormat;
    	      this.description = defaults.description;
    	      this.latestSchemaVersion = defaults.latestSchemaVersion;
    	      this.nextSchemaVersion = defaults.nextSchemaVersion;
    	      this.registryArn = defaults.registryArn;
    	      this.registryName = defaults.registryName;
    	      this.schemaCheckpoint = defaults.schemaCheckpoint;
    	      this.schemaDefinition = defaults.schemaDefinition;
    	      this.schemaName = defaults.schemaName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder compatibility(@Nullable Output<String> compatibility) {
            this.compatibility = compatibility;
            return this;
        }
        public Builder compatibility(@Nullable String compatibility) {
            this.compatibility = Codegen.ofNullable(compatibility);
            return this;
        }
        public Builder dataFormat(@Nullable Output<String> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder dataFormat(@Nullable String dataFormat) {
            this.dataFormat = Codegen.ofNullable(dataFormat);
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
        public Builder latestSchemaVersion(@Nullable Output<Integer> latestSchemaVersion) {
            this.latestSchemaVersion = latestSchemaVersion;
            return this;
        }
        public Builder latestSchemaVersion(@Nullable Integer latestSchemaVersion) {
            this.latestSchemaVersion = Codegen.ofNullable(latestSchemaVersion);
            return this;
        }
        public Builder nextSchemaVersion(@Nullable Output<Integer> nextSchemaVersion) {
            this.nextSchemaVersion = nextSchemaVersion;
            return this;
        }
        public Builder nextSchemaVersion(@Nullable Integer nextSchemaVersion) {
            this.nextSchemaVersion = Codegen.ofNullable(nextSchemaVersion);
            return this;
        }
        public Builder registryArn(@Nullable Output<String> registryArn) {
            this.registryArn = registryArn;
            return this;
        }
        public Builder registryArn(@Nullable String registryArn) {
            this.registryArn = Codegen.ofNullable(registryArn);
            return this;
        }
        public Builder registryName(@Nullable Output<String> registryName) {
            this.registryName = registryName;
            return this;
        }
        public Builder registryName(@Nullable String registryName) {
            this.registryName = Codegen.ofNullable(registryName);
            return this;
        }
        public Builder schemaCheckpoint(@Nullable Output<Integer> schemaCheckpoint) {
            this.schemaCheckpoint = schemaCheckpoint;
            return this;
        }
        public Builder schemaCheckpoint(@Nullable Integer schemaCheckpoint) {
            this.schemaCheckpoint = Codegen.ofNullable(schemaCheckpoint);
            return this;
        }
        public Builder schemaDefinition(@Nullable Output<String> schemaDefinition) {
            this.schemaDefinition = schemaDefinition;
            return this;
        }
        public Builder schemaDefinition(@Nullable String schemaDefinition) {
            this.schemaDefinition = Codegen.ofNullable(schemaDefinition);
            return this;
        }
        public Builder schemaName(@Nullable Output<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = Codegen.ofNullable(schemaName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public SchemaState build() {
            return new SchemaState(arn, compatibility, dataFormat, description, latestSchemaVersion, nextSchemaVersion, registryArn, registryName, schemaCheckpoint, schemaDefinition, schemaName, tags, tagsAll);
        }
    }
}
