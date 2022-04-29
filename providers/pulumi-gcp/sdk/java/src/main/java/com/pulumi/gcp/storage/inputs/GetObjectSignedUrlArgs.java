// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectSignedUrlArgs extends InvokeArgs {

    public static final GetObjectSignedUrlArgs Empty = new GetObjectSignedUrlArgs();

    /**
     * The name of the bucket to read the object from
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return The name of the bucket to read the object from
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * The [MD5 digest](https://cloud.google.com/storage/docs/hashes-etags#_MD5) value in Base64.
     * Typically retrieved from `google_storage_bucket_object.object.md5hash` attribute.
     * If you provide this in the datasource, the client (e.g. browser, curl) must provide the `Content-MD5` HTTP header with this same value in its request.
     * 
     */
    @Import(name="contentMd5")
    private @Nullable String contentMd5;

    /**
     * @return The [MD5 digest](https://cloud.google.com/storage/docs/hashes-etags#_MD5) value in Base64.
     * Typically retrieved from `google_storage_bucket_object.object.md5hash` attribute.
     * If you provide this in the datasource, the client (e.g. browser, curl) must provide the `Content-MD5` HTTP header with this same value in its request.
     * 
     */
    public Optional<String> contentMd5() {
        return Optional.ofNullable(this.contentMd5);
    }

    /**
     * If you specify this in the datasource, the client must provide the `Content-Type` HTTP header with the same value in its request.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return If you specify this in the datasource, the client must provide the `Content-Type` HTTP header with the same value in its request.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * What Google service account credentials json should be used to sign the URL.
     * This data source checks the following locations for credentials, in order of preference: data source `credentials` attribute, provider `credentials` attribute and finally the GOOGLE_APPLICATION_CREDENTIALS environment variable.
     * 
     */
    @Import(name="credentials")
    private @Nullable String credentials;

    /**
     * @return What Google service account credentials json should be used to sign the URL.
     * This data source checks the following locations for credentials, in order of preference: data source `credentials` attribute, provider `credentials` attribute and finally the GOOGLE_APPLICATION_CREDENTIALS environment variable.
     * 
     */
    public Optional<String> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * For how long shall the signed URL be valid (defaults to 1 hour - i.e. `1h`).
     * See [here](https://golang.org/pkg/time/#ParseDuration) for info on valid duration formats.
     * 
     */
    @Import(name="duration")
    private @Nullable String duration;

    /**
     * @return For how long shall the signed URL be valid (defaults to 1 hour - i.e. `1h`).
     * See [here](https://golang.org/pkg/time/#ParseDuration) for info on valid duration formats.
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * As needed. The server checks to make sure that the client provides matching values in requests using the signed URL.
     * Any header starting with `x-goog-` is accepted but see the [Google Docs](https://cloud.google.com/storage/docs/xml-api/reference-headers) for list of headers that are supported by Google.
     * 
     */
    @Import(name="extensionHeaders")
    private @Nullable Map<String,String> extensionHeaders;

    /**
     * @return As needed. The server checks to make sure that the client provides matching values in requests using the signed URL.
     * Any header starting with `x-goog-` is accepted but see the [Google Docs](https://cloud.google.com/storage/docs/xml-api/reference-headers) for list of headers that are supported by Google.
     * 
     */
    public Optional<Map<String,String>> extensionHeaders() {
        return Optional.ofNullable(this.extensionHeaders);
    }

    /**
     * What HTTP Method will the signed URL allow (defaults to `GET`)
     * 
     */
    @Import(name="httpMethod")
    private @Nullable String httpMethod;

    /**
     * @return What HTTP Method will the signed URL allow (defaults to `GET`)
     * 
     */
    public Optional<String> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The full path to the object inside the bucket
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return The full path to the object inside the bucket
     * 
     */
    public String path() {
        return this.path;
    }

    private GetObjectSignedUrlArgs() {}

    private GetObjectSignedUrlArgs(GetObjectSignedUrlArgs $) {
        this.bucket = $.bucket;
        this.contentMd5 = $.contentMd5;
        this.contentType = $.contentType;
        this.credentials = $.credentials;
        this.duration = $.duration;
        this.extensionHeaders = $.extensionHeaders;
        this.httpMethod = $.httpMethod;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectSignedUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectSignedUrlArgs $;

        public Builder() {
            $ = new GetObjectSignedUrlArgs();
        }

        public Builder(GetObjectSignedUrlArgs defaults) {
            $ = new GetObjectSignedUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket to read the object from
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param contentMd5 The [MD5 digest](https://cloud.google.com/storage/docs/hashes-etags#_MD5) value in Base64.
         * Typically retrieved from `google_storage_bucket_object.object.md5hash` attribute.
         * If you provide this in the datasource, the client (e.g. browser, curl) must provide the `Content-MD5` HTTP header with this same value in its request.
         * 
         * @return builder
         * 
         */
        public Builder contentMd5(@Nullable String contentMd5) {
            $.contentMd5 = contentMd5;
            return this;
        }

        /**
         * @param contentType If you specify this in the datasource, the client must provide the `Content-Type` HTTP header with the same value in its request.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param credentials What Google service account credentials json should be used to sign the URL.
         * This data source checks the following locations for credentials, in order of preference: data source `credentials` attribute, provider `credentials` attribute and finally the GOOGLE_APPLICATION_CREDENTIALS environment variable.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable String credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param duration For how long shall the signed URL be valid (defaults to 1 hour - i.e. `1h`).
         * See [here](https://golang.org/pkg/time/#ParseDuration) for info on valid duration formats.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable String duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param extensionHeaders As needed. The server checks to make sure that the client provides matching values in requests using the signed URL.
         * Any header starting with `x-goog-` is accepted but see the [Google Docs](https://cloud.google.com/storage/docs/xml-api/reference-headers) for list of headers that are supported by Google.
         * 
         * @return builder
         * 
         */
        public Builder extensionHeaders(@Nullable Map<String,String> extensionHeaders) {
            $.extensionHeaders = extensionHeaders;
            return this;
        }

        /**
         * @param httpMethod What HTTP Method will the signed URL allow (defaults to `GET`)
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable String httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param path The full path to the object inside the bucket
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GetObjectSignedUrlArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
