// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationProfileValidator {
    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
     */
    private final @Nullable String content;
    /**
     * The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"content","type"})
    private ConfigurationProfileValidator(
        @Nullable String content,
        String type) {
        this.content = content;
        this.type = type;
    }

    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileValidator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileValidator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.type = defaults.type;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ConfigurationProfileValidator build() {
            return new ConfigurationProfileValidator(content, type);
        }
    }
}
