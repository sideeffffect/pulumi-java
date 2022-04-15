// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedConfigurationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostedConfigurationVersionArgs Empty = new HostedConfigurationVersionArgs();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
      private final Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The configuration profile ID.
     * 
     */
    @Import(name="configurationProfileId", required=true)
      private final Output<String> configurationProfileId;

    public Output<String> configurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * The content of the configuration or the configuration data.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * A description of the configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    public HostedConfigurationVersionArgs(
        Output<String> applicationId,
        Output<String> configurationProfileId,
        Output<String> content,
        Output<String> contentType,
        @Nullable Output<String> description) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.configurationProfileId = Objects.requireNonNull(configurationProfileId, "expected parameter 'configurationProfileId' to be non-null");
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.description = description;
    }

    private HostedConfigurationVersionArgs() {
        this.applicationId = Codegen.empty();
        this.configurationProfileId = Codegen.empty();
        this.content = Codegen.empty();
        this.contentType = Codegen.empty();
        this.description = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedConfigurationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationId;
        private Output<String> configurationProfileId;
        private Output<String> content;
        private Output<String> contentType;
        private @Nullable Output<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedConfigurationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.configurationProfileId = defaults.configurationProfileId;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
        }

        public Builder applicationId(Output<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder applicationId(String applicationId) {
            this.applicationId = Output.of(Objects.requireNonNull(applicationId));
            return this;
        }
        public Builder configurationProfileId(Output<String> configurationProfileId) {
            this.configurationProfileId = Objects.requireNonNull(configurationProfileId);
            return this;
        }
        public Builder configurationProfileId(String configurationProfileId) {
            this.configurationProfileId = Output.of(Objects.requireNonNull(configurationProfileId));
            return this;
        }
        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }
        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }        public HostedConfigurationVersionArgs build() {
            return new HostedConfigurationVersionArgs(applicationId, configurationProfileId, content, contentType, description);
        }
    }
}
