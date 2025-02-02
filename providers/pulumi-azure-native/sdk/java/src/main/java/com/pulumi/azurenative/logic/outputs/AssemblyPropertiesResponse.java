// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssemblyPropertiesResponse {
    /**
     * @return The assembly culture.
     * 
     */
    private final @Nullable String assemblyCulture;
    /**
     * @return The assembly name.
     * 
     */
    private final String assemblyName;
    /**
     * @return The assembly public key token.
     * 
     */
    private final @Nullable String assemblyPublicKeyToken;
    /**
     * @return The assembly version.
     * 
     */
    private final @Nullable String assemblyVersion;
    /**
     * @return The artifact changed time.
     * 
     */
    private final @Nullable String changedTime;
    private final @Nullable Object content;
    /**
     * @return The content link.
     * 
     */
    private final @Nullable ContentLinkResponse contentLink;
    /**
     * @return The content type.
     * 
     */
    private final @Nullable String contentType;
    /**
     * @return The artifact creation time.
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable Object metadata;

    @CustomType.Constructor
    private AssemblyPropertiesResponse(
        @CustomType.Parameter("assemblyCulture") @Nullable String assemblyCulture,
        @CustomType.Parameter("assemblyName") String assemblyName,
        @CustomType.Parameter("assemblyPublicKeyToken") @Nullable String assemblyPublicKeyToken,
        @CustomType.Parameter("assemblyVersion") @Nullable String assemblyVersion,
        @CustomType.Parameter("changedTime") @Nullable String changedTime,
        @CustomType.Parameter("content") @Nullable Object content,
        @CustomType.Parameter("contentLink") @Nullable ContentLinkResponse contentLink,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("metadata") @Nullable Object metadata) {
        this.assemblyCulture = assemblyCulture;
        this.assemblyName = assemblyName;
        this.assemblyPublicKeyToken = assemblyPublicKeyToken;
        this.assemblyVersion = assemblyVersion;
        this.changedTime = changedTime;
        this.content = content;
        this.contentLink = contentLink;
        this.contentType = contentType;
        this.createdTime = createdTime;
        this.metadata = metadata;
    }

    /**
     * @return The assembly culture.
     * 
     */
    public Optional<String> assemblyCulture() {
        return Optional.ofNullable(this.assemblyCulture);
    }
    /**
     * @return The assembly name.
     * 
     */
    public String assemblyName() {
        return this.assemblyName;
    }
    /**
     * @return The assembly public key token.
     * 
     */
    public Optional<String> assemblyPublicKeyToken() {
        return Optional.ofNullable(this.assemblyPublicKeyToken);
    }
    /**
     * @return The assembly version.
     * 
     */
    public Optional<String> assemblyVersion() {
        return Optional.ofNullable(this.assemblyVersion);
    }
    /**
     * @return The artifact changed time.
     * 
     */
    public Optional<String> changedTime() {
        return Optional.ofNullable(this.changedTime);
    }
    public Optional<Object> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The content link.
     * 
     */
    public Optional<ContentLinkResponse> contentLink() {
        return Optional.ofNullable(this.contentLink);
    }
    /**
     * @return The content type.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * @return The artifact creation time.
     * 
     */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssemblyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assemblyCulture;
        private String assemblyName;
        private @Nullable String assemblyPublicKeyToken;
        private @Nullable String assemblyVersion;
        private @Nullable String changedTime;
        private @Nullable Object content;
        private @Nullable ContentLinkResponse contentLink;
        private @Nullable String contentType;
        private @Nullable String createdTime;
        private @Nullable Object metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(AssemblyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assemblyCulture = defaults.assemblyCulture;
    	      this.assemblyName = defaults.assemblyName;
    	      this.assemblyPublicKeyToken = defaults.assemblyPublicKeyToken;
    	      this.assemblyVersion = defaults.assemblyVersion;
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
    	      this.contentType = defaults.contentType;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
        }

        public Builder assemblyCulture(@Nullable String assemblyCulture) {
            this.assemblyCulture = assemblyCulture;
            return this;
        }
        public Builder assemblyName(String assemblyName) {
            this.assemblyName = Objects.requireNonNull(assemblyName);
            return this;
        }
        public Builder assemblyPublicKeyToken(@Nullable String assemblyPublicKeyToken) {
            this.assemblyPublicKeyToken = assemblyPublicKeyToken;
            return this;
        }
        public Builder assemblyVersion(@Nullable String assemblyVersion) {
            this.assemblyVersion = assemblyVersion;
            return this;
        }
        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }
        public Builder content(@Nullable Object content) {
            this.content = content;
            return this;
        }
        public Builder contentLink(@Nullable ContentLinkResponse contentLink) {
            this.contentLink = contentLink;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }        public AssemblyPropertiesResponse build() {
            return new AssemblyPropertiesResponse(assemblyCulture, assemblyName, assemblyPublicKeyToken, assemblyVersion, changedTime, content, contentLink, contentType, createdTime, metadata);
        }
    }
}
