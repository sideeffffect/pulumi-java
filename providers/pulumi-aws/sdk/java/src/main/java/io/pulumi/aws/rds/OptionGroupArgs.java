// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.rds.inputs.OptionGroupOptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OptionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionGroupArgs Empty = new OptionGroupArgs();

    /**
     * Specifies the name of the engine that this option group should be associated with.
     * 
     */
    @Import(name="engineName", required=true)
      private final Output<String> engineName;

    public Output<String> engineName() {
        return this.engineName;
    }

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    @Import(name="majorEngineVersion", required=true)
      private final Output<String> majorEngineVersion;

    public Output<String> majorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * The Name of the setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The description of the option group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="optionGroupDescription")
      private final @Nullable Output<String> optionGroupDescription;

    public Output<String> optionGroupDescription() {
        return this.optionGroupDescription == null ? Codegen.empty() : this.optionGroupDescription;
    }

    /**
     * A list of Options to apply.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<List<OptionGroupOptionArgs>> options;

    public Output<List<OptionGroupOptionArgs>> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public OptionGroupArgs(
        Output<String> engineName,
        Output<String> majorEngineVersion,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> optionGroupDescription,
        @Nullable Output<List<OptionGroupOptionArgs>> options,
        @Nullable Output<Map<String,String>> tags) {
        this.engineName = Objects.requireNonNull(engineName, "expected parameter 'engineName' to be non-null");
        this.majorEngineVersion = Objects.requireNonNull(majorEngineVersion, "expected parameter 'majorEngineVersion' to be non-null");
        this.name = name;
        this.namePrefix = namePrefix;
        this.optionGroupDescription = optionGroupDescription == null ? Codegen.ofNullable("Managed by Pulumi") : optionGroupDescription;
        this.options = options;
        this.tags = tags;
    }

    private OptionGroupArgs() {
        this.engineName = Codegen.empty();
        this.majorEngineVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.optionGroupDescription = Codegen.empty();
        this.options = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> engineName;
        private Output<String> majorEngineVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> optionGroupDescription;
        private @Nullable Output<List<OptionGroupOptionArgs>> options;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engineName = defaults.engineName;
    	      this.majorEngineVersion = defaults.majorEngineVersion;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.optionGroupDescription = defaults.optionGroupDescription;
    	      this.options = defaults.options;
    	      this.tags = defaults.tags;
        }

        public Builder engineName(Output<String> engineName) {
            this.engineName = Objects.requireNonNull(engineName);
            return this;
        }
        public Builder engineName(String engineName) {
            this.engineName = Output.of(Objects.requireNonNull(engineName));
            return this;
        }
        public Builder majorEngineVersion(Output<String> majorEngineVersion) {
            this.majorEngineVersion = Objects.requireNonNull(majorEngineVersion);
            return this;
        }
        public Builder majorEngineVersion(String majorEngineVersion) {
            this.majorEngineVersion = Output.of(Objects.requireNonNull(majorEngineVersion));
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder optionGroupDescription(@Nullable Output<String> optionGroupDescription) {
            this.optionGroupDescription = optionGroupDescription;
            return this;
        }
        public Builder optionGroupDescription(@Nullable String optionGroupDescription) {
            this.optionGroupDescription = Codegen.ofNullable(optionGroupDescription);
            return this;
        }
        public Builder options(@Nullable Output<List<OptionGroupOptionArgs>> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable List<OptionGroupOptionArgs> options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder options(OptionGroupOptionArgs... options) {
            return options(List.of(options));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public OptionGroupArgs build() {
            return new OptionGroupArgs(engineName, majorEngineVersion, name, namePrefix, optionGroupDescription, options, tags);
        }
    }
}
