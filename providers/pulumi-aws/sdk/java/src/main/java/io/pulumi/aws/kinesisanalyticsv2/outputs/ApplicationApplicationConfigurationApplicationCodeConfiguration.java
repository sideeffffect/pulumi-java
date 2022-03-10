// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationApplicationCodeConfiguration {
    /**
     * The location and type of the application code.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent;
    /**
     * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
     */
    private final String codeContentType;

    @OutputCustomType.Constructor
    private ApplicationApplicationConfigurationApplicationCodeConfiguration(
        @OutputCustomType.Parameter("codeContent") @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent,
        @OutputCustomType.Parameter("codeContentType") String codeContentType) {
        this.codeContent = codeContent;
        this.codeContentType = codeContentType;
    }

    /**
     * The location and type of the application code.
     * 
    */
    public Optional<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent> getCodeContent() {
        return Optional.ofNullable(this.codeContent);
    }
    /**
     * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
    */
    public String getCodeContentType() {
        return this.codeContentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent;
        private String codeContentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeContent = defaults.codeContent;
    	      this.codeContentType = defaults.codeContentType;
        }

        public Builder codeContent(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent) {
            this.codeContent = codeContent;
            return this;
        }

        public Builder codeContentType(String codeContentType) {
            this.codeContentType = Objects.requireNonNull(codeContentType);
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfiguration build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfiguration(codeContent, codeContentType);
        }
    }
}
