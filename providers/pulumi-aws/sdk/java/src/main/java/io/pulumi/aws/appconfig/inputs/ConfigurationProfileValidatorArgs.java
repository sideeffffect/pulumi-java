// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileValidatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileValidatorArgs Empty = new ConfigurationProfileValidatorArgs();

    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> content() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ConfigurationProfileValidatorArgs(
        @Nullable Output<String> content,
        Output<String> type) {
        this.content = content;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConfigurationProfileValidatorArgs() {
        this.content = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileValidatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.type = defaults.type;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ConfigurationProfileValidatorArgs build() {
            return new ConfigurationProfileValidatorArgs(content, type);
        }
    }
}
