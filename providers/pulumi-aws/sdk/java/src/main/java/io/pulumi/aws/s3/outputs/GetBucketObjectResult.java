// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBucketObjectResult {
    /**
     * Object data (see **limitations above** to understand cases in which this field is actually available)
     * 
     */
    private final String body;
    private final String bucket;
    /**
     * (Optional) Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    private final Boolean bucketKeyEnabled;
    /**
     * Specifies caching behavior along the request/reply chain.
     * 
     */
    private final String cacheControl;
    /**
     * Specifies presentational information for the object.
     * 
     */
    private final String contentDisposition;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
     * 
     */
    private final String contentEncoding;
    /**
     * The language the content is in.
     * 
     */
    private final String contentLanguage;
    /**
     * Size of the body in bytes.
     * 
     */
    private final Integer contentLength;
    /**
     * A standard MIME type describing the format of the object data.
     * 
     */
    private final String contentType;
    /**
     * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
     * 
     */
    private final String etag;
    /**
     * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
     * 
     */
    private final String expiration;
    /**
     * The date and time at which the object is no longer cacheable.
     * 
     */
    private final String expires;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String key;
    /**
     * Last modified date of the object in RFC1123 format (e.g., `Mon, 02 Jan 2006 15:04:05 MST`)
     * 
     */
    private final String lastModified;
    /**
     * A map of metadata stored with the object in S3
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Indicates whether this object has an active [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds). This field is only returned if you have permission to view an object's legal hold status.
     * 
     */
    private final String objectLockLegalHoldStatus;
    /**
     * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) currently in place for this object.
     * 
     */
    private final String objectLockMode;
    /**
     * The date and time when this object's object lock will expire.
     * 
     */
    private final String objectLockRetainUntilDate;
    private final @Nullable String range;
    /**
     * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
     * 
     */
    private final String serverSideEncryption;
    /**
     * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
     * 
     */
    private final String sseKmsKeyId;
    /**
     * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
     * 
     */
    private final String storageClass;
    /**
     * A map of tags assigned to the object.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The latest version ID of the object returned.
     * 
     */
    private final String versionId;
    /**
     * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     * 
     */
    private final String websiteRedirectLocation;

    @OutputCustomType.Constructor
    private GetBucketObjectResult(
        @OutputCustomType.Parameter("body") String body,
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("bucketKeyEnabled") Boolean bucketKeyEnabled,
        @OutputCustomType.Parameter("cacheControl") String cacheControl,
        @OutputCustomType.Parameter("contentDisposition") String contentDisposition,
        @OutputCustomType.Parameter("contentEncoding") String contentEncoding,
        @OutputCustomType.Parameter("contentLanguage") String contentLanguage,
        @OutputCustomType.Parameter("contentLength") Integer contentLength,
        @OutputCustomType.Parameter("contentType") String contentType,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("expiration") String expiration,
        @OutputCustomType.Parameter("expires") String expires,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("lastModified") String lastModified,
        @OutputCustomType.Parameter("metadata") Map<String,String> metadata,
        @OutputCustomType.Parameter("objectLockLegalHoldStatus") String objectLockLegalHoldStatus,
        @OutputCustomType.Parameter("objectLockMode") String objectLockMode,
        @OutputCustomType.Parameter("objectLockRetainUntilDate") String objectLockRetainUntilDate,
        @OutputCustomType.Parameter("range") @Nullable String range,
        @OutputCustomType.Parameter("serverSideEncryption") String serverSideEncryption,
        @OutputCustomType.Parameter("sseKmsKeyId") String sseKmsKeyId,
        @OutputCustomType.Parameter("storageClass") String storageClass,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("versionId") String versionId,
        @OutputCustomType.Parameter("websiteRedirectLocation") String websiteRedirectLocation) {
        this.body = body;
        this.bucket = bucket;
        this.bucketKeyEnabled = bucketKeyEnabled;
        this.cacheControl = cacheControl;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentLength = contentLength;
        this.contentType = contentType;
        this.etag = etag;
        this.expiration = expiration;
        this.expires = expires;
        this.id = id;
        this.key = key;
        this.lastModified = lastModified;
        this.metadata = metadata;
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        this.objectLockMode = objectLockMode;
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        this.range = range;
        this.serverSideEncryption = serverSideEncryption;
        this.sseKmsKeyId = sseKmsKeyId;
        this.storageClass = storageClass;
        this.tags = tags;
        this.versionId = versionId;
        this.websiteRedirectLocation = websiteRedirectLocation;
    }

    /**
     * Object data (see **limitations above** to understand cases in which this field is actually available)
     * 
    */
    public String getBody() {
        return this.body;
    }
    public String getBucket() {
        return this.bucket;
    }
    /**
     * (Optional) Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
    */
    public Boolean getBucketKeyEnabled() {
        return this.bucketKeyEnabled;
    }
    /**
     * Specifies caching behavior along the request/reply chain.
     * 
    */
    public String getCacheControl() {
        return this.cacheControl;
    }
    /**
     * Specifies presentational information for the object.
     * 
    */
    public String getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
     * 
    */
    public String getContentEncoding() {
        return this.contentEncoding;
    }
    /**
     * The language the content is in.
     * 
    */
    public String getContentLanguage() {
        return this.contentLanguage;
    }
    /**
     * Size of the body in bytes.
     * 
    */
    public Integer getContentLength() {
        return this.contentLength;
    }
    /**
     * A standard MIME type describing the format of the object data.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
     * 
    */
    public String getExpiration() {
        return this.expiration;
    }
    /**
     * The date and time at which the object is no longer cacheable.
     * 
    */
    public String getExpires() {
        return this.expires;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getKey() {
        return this.key;
    }
    /**
     * Last modified date of the object in RFC1123 format (e.g., `Mon, 02 Jan 2006 15:04:05 MST`)
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * A map of metadata stored with the object in S3
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Indicates whether this object has an active [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds). This field is only returned if you have permission to view an object's legal hold status.
     * 
    */
    public String getObjectLockLegalHoldStatus() {
        return this.objectLockLegalHoldStatus;
    }
    /**
     * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) currently in place for this object.
     * 
    */
    public String getObjectLockMode() {
        return this.objectLockMode;
    }
    /**
     * The date and time when this object's object lock will expire.
     * 
    */
    public String getObjectLockRetainUntilDate() {
        return this.objectLockRetainUntilDate;
    }
    public Optional<String> getRange() {
        return Optional.ofNullable(this.range);
    }
    /**
     * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
     * 
    */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
     * 
    */
    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }
    /**
     * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
     * 
    */
    public String getStorageClass() {
        return this.storageClass;
    }
    /**
     * A map of tags assigned to the object.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The latest version ID of the object returned.
     * 
    */
    public String getVersionId() {
        return this.versionId;
    }
    /**
     * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     * 
    */
    public String getWebsiteRedirectLocation() {
        return this.websiteRedirectLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private String bucket;
        private Boolean bucketKeyEnabled;
        private String cacheControl;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private Integer contentLength;
        private String contentType;
        private String etag;
        private String expiration;
        private String expires;
        private String id;
        private String key;
        private String lastModified;
        private Map<String,String> metadata;
        private String objectLockLegalHoldStatus;
        private String objectLockMode;
        private String objectLockRetainUntilDate;
        private @Nullable String range;
        private String serverSideEncryption;
        private String sseKmsKeyId;
        private String storageClass;
        private Map<String,String> tags;
        private String versionId;
        private String websiteRedirectLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.bucket = defaults.bucket;
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
    	      this.cacheControl = defaults.cacheControl;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentLength = defaults.contentLength;
    	      this.contentType = defaults.contentType;
    	      this.etag = defaults.etag;
    	      this.expiration = defaults.expiration;
    	      this.expires = defaults.expires;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.lastModified = defaults.lastModified;
    	      this.metadata = defaults.metadata;
    	      this.objectLockLegalHoldStatus = defaults.objectLockLegalHoldStatus;
    	      this.objectLockMode = defaults.objectLockMode;
    	      this.objectLockRetainUntilDate = defaults.objectLockRetainUntilDate;
    	      this.range = defaults.range;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.sseKmsKeyId = defaults.sseKmsKeyId;
    	      this.storageClass = defaults.storageClass;
    	      this.tags = defaults.tags;
    	      this.versionId = defaults.versionId;
    	      this.websiteRedirectLocation = defaults.websiteRedirectLocation;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = Objects.requireNonNull(bucketKeyEnabled);
            return this;
        }

        public Builder cacheControl(String cacheControl) {
            this.cacheControl = Objects.requireNonNull(cacheControl);
            return this;
        }

        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }

        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = Objects.requireNonNull(contentEncoding);
            return this;
        }

        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = Objects.requireNonNull(contentLanguage);
            return this;
        }

        public Builder contentLength(Integer contentLength) {
            this.contentLength = Objects.requireNonNull(contentLength);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder expiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }

        public Builder expires(String expires) {
            this.expires = Objects.requireNonNull(expires);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = Objects.requireNonNull(objectLockLegalHoldStatus);
            return this;
        }

        public Builder objectLockMode(String objectLockMode) {
            this.objectLockMode = Objects.requireNonNull(objectLockMode);
            return this;
        }

        public Builder objectLockRetainUntilDate(String objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = Objects.requireNonNull(objectLockRetainUntilDate);
            return this;
        }

        public Builder range(@Nullable String range) {
            this.range = range;
            return this;
        }

        public Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = Objects.requireNonNull(serverSideEncryption);
            return this;
        }

        public Builder sseKmsKeyId(String sseKmsKeyId) {
            this.sseKmsKeyId = Objects.requireNonNull(sseKmsKeyId);
            return this;
        }

        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }

        public Builder websiteRedirectLocation(String websiteRedirectLocation) {
            this.websiteRedirectLocation = Objects.requireNonNull(websiteRedirectLocation);
            return this;
        }
        public GetBucketObjectResult build() {
            return new GetBucketObjectResult(body, bucket, bucketKeyEnabled, cacheControl, contentDisposition, contentEncoding, contentLanguage, contentLength, contentType, etag, expiration, expires, id, key, lastModified, metadata, objectLockLegalHoldStatus, objectLockMode, objectLockRetainUntilDate, range, serverSideEncryption, sseKmsKeyId, storageClass, tags, versionId, websiteRedirectLocation);
        }
    }
}
