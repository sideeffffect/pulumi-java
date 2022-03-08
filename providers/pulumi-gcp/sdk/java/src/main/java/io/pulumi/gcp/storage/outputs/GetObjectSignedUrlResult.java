// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetObjectSignedUrlResult {
    private final String bucket;
    private final @Nullable String contentMd5;
    private final @Nullable String contentType;
    private final @Nullable String credentials;
    private final @Nullable String duration;
    private final @Nullable Map<String,String> extensionHeaders;
    private final @Nullable String httpMethod;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String path;
    /**
     * The signed URL that can be used to access the storage object without authentication.
     * 
     */
    private final String signedUrl;

    @OutputCustomType.Constructor({"bucket","contentMd5","contentType","credentials","duration","extensionHeaders","httpMethod","id","path","signedUrl"})
    private GetObjectSignedUrlResult(
        String bucket,
        @Nullable String contentMd5,
        @Nullable String contentType,
        @Nullable String credentials,
        @Nullable String duration,
        @Nullable Map<String,String> extensionHeaders,
        @Nullable String httpMethod,
        String id,
        String path,
        String signedUrl) {
        this.bucket = bucket;
        this.contentMd5 = contentMd5;
        this.contentType = contentType;
        this.credentials = credentials;
        this.duration = duration;
        this.extensionHeaders = extensionHeaders;
        this.httpMethod = httpMethod;
        this.id = id;
        this.path = path;
        this.signedUrl = signedUrl;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Optional<String> getContentMd5() {
        return Optional.ofNullable(this.contentMd5);
    }
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    public Optional<String> getDuration() {
        return Optional.ofNullable(this.duration);
    }
    public Map<String,String> getExtensionHeaders() {
        return this.extensionHeaders == null ? Map.of() : this.extensionHeaders;
    }
    public Optional<String> getHttpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getPath() {
        return this.path;
    }
    /**
     * The signed URL that can be used to access the storage object without authentication.
     * 
    */
    public String getSignedUrl() {
        return this.signedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectSignedUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String contentMd5;
        private @Nullable String contentType;
        private @Nullable String credentials;
        private @Nullable String duration;
        private @Nullable Map<String,String> extensionHeaders;
        private @Nullable String httpMethod;
        private String id;
        private String path;
        private String signedUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectSignedUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.contentMd5 = defaults.contentMd5;
    	      this.contentType = defaults.contentType;
    	      this.credentials = defaults.credentials;
    	      this.duration = defaults.duration;
    	      this.extensionHeaders = defaults.extensionHeaders;
    	      this.httpMethod = defaults.httpMethod;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.signedUrl = defaults.signedUrl;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setContentMd5(@Nullable String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCredentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setExtensionHeaders(@Nullable Map<String,String> extensionHeaders) {
            this.extensionHeaders = extensionHeaders;
            return this;
        }

        public Builder setHttpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setSignedUrl(String signedUrl) {
            this.signedUrl = Objects.requireNonNull(signedUrl);
            return this;
        }
        public GetObjectSignedUrlResult build() {
            return new GetObjectSignedUrlResult(bucket, contentMd5, contentType, credentials, duration, extensionHeaders, httpMethod, id, path, signedUrl);
        }
    }
}
