// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyDocumentation {
    /**
     * The text of the documentation, interpreted according to mimeType.
     * The content may not exceed 8,192 Unicode characters and may not
     * exceed more than 10,240 bytes when encoded in UTF-8 format,
     * whichever is smaller.
     * 
     */
    private final @Nullable String content;
    /**
     * The format of the content field. Presently, only the value
     * "text/markdown" is supported.
     * 
     */
    private final @Nullable String mimeType;

    @CustomType.Constructor
    private AlertPolicyDocumentation(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("mimeType") @Nullable String mimeType) {
        this.content = content;
        this.mimeType = mimeType;
    }

    /**
     * The text of the documentation, interpreted according to mimeType.
     * The content may not exceed 8,192 Unicode characters and may not
     * exceed more than 10,240 bytes when encoded in UTF-8 format,
     * whichever is smaller.
     * 
    */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The format of the content field. Presently, only the value
     * "text/markdown" is supported.
     * 
    */
    public Optional<String> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyDocumentation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyDocumentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = mimeType;
            return this;
        }        public AlertPolicyDocumentation build() {
            return new AlertPolicyDocumentation(content, mimeType);
        }
    }
}
