// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectCopyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectCopyArgs Empty = new ObjectCopyArgs();

    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to `private`. Valid values are `private`, `public-read`, `public-read-write`, `authenticated-read`, `aws-exec-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Conflicts with `grant`.
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * Name of the bucket to put the file in.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="bucketKeyEnabled")
    private @Nullable Output<Boolean> bucketKeyEnabled;

    public Optional<Output<Boolean>> bucketKeyEnabled() {
        return Optional.ofNullable(this.bucketKeyEnabled);
    }

    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    @Import(name="cacheControl")
    private @Nullable Output<String> cacheControl;

    public Optional<Output<String>> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable Output<String> contentDisposition;

    public Optional<Output<String>> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * Language the content is in e.g., en-US or en-GB.
     * 
     */
    @Import(name="contentLanguage")
    private @Nullable Output<String> contentLanguage;

    public Optional<Output<String>> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }

    /**
     * Standard MIME type describing the format of the object data, e.g., `application/octet-stream`. All Valid MIME Types are valid for this input.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * 
     */
    @Import(name="copyIfMatch")
    private @Nullable Output<String> copyIfMatch;

    public Optional<Output<String>> copyIfMatch() {
        return Optional.ofNullable(this.copyIfMatch);
    }

    /**
     * Copies the object if it has been modified since the specified time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="copyIfModifiedSince")
    private @Nullable Output<String> copyIfModifiedSince;

    public Optional<Output<String>> copyIfModifiedSince() {
        return Optional.ofNullable(this.copyIfModifiedSince);
    }

    /**
     * Copies the object if its entity tag (ETag) is different than the specified ETag.
     * 
     */
    @Import(name="copyIfNoneMatch")
    private @Nullable Output<String> copyIfNoneMatch;

    public Optional<Output<String>> copyIfNoneMatch() {
        return Optional.ofNullable(this.copyIfNoneMatch);
    }

    /**
     * Copies the object if it hasn&#39;t been modified since the specified time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="copyIfUnmodifiedSince")
    private @Nullable Output<String> copyIfUnmodifiedSince;

    public Optional<Output<String>> copyIfUnmodifiedSince() {
        return Optional.ofNullable(this.copyIfUnmodifiedSince);
    }

    /**
     * Specifies the algorithm to use to when encrypting the object (for example, AES256).
     * 
     */
    @Import(name="customerAlgorithm")
    private @Nullable Output<String> customerAlgorithm;

    public Optional<Output<String>> customerAlgorithm() {
        return Optional.ofNullable(this.customerAlgorithm);
    }

    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
     * 
     */
    @Import(name="customerKey")
    private @Nullable Output<String> customerKey;

    public Optional<Output<String>> customerKey() {
        return Optional.ofNullable(this.customerKey);
    }

    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
     * 
     */
    @Import(name="customerKeyMd5")
    private @Nullable Output<String> customerKeyMd5;

    public Optional<Output<String>> customerKeyMd5() {
        return Optional.ofNullable(this.customerKeyMd5);
    }

    /**
     * Account id of the expected destination bucket owner. If the destination bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    @Import(name="expectedBucketOwner")
    private @Nullable Output<String> expectedBucketOwner;

    public Optional<Output<String>> expectedBucketOwner() {
        return Optional.ofNullable(this.expectedBucketOwner);
    }

    /**
     * Account id of the expected source bucket owner. If the source bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    @Import(name="expectedSourceBucketOwner")
    private @Nullable Output<String> expectedSourceBucketOwner;

    public Optional<Output<String>> expectedSourceBucketOwner() {
        return Optional.ofNullable(this.expectedSourceBucketOwner);
    }

    /**
     * Date and time at which the object is no longer cacheable, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="expires")
    private @Nullable Output<String> expires;

    public Optional<Output<String>> expires() {
        return Optional.ofNullable(this.expires);
    }

    /**
     * Allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * Configuration block for header grants. Documented below. Conflicts with `acl`.
     * 
     */
    @Import(name="grants")
    private @Nullable Output<List<ObjectCopyGrantArgs>> grants;

    public Optional<Output<List<ObjectCopyGrantArgs>>> grants() {
        return Optional.ofNullable(this.grants);
    }

    /**
     * Name of the object once it is in the bucket.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Specifies the AWS KMS Encryption Context to use for object encryption. The value is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
     * 
     */
    @Import(name="kmsEncryptionContext")
    private @Nullable Output<String> kmsEncryptionContext;

    public Optional<Output<String>> kmsEncryptionContext() {
        return Optional.ofNullable(this.kmsEncryptionContext);
    }

    /**
     * Specifies the AWS KMS Key ARN to use for object encryption. This value is a fully qualified **ARN** of the KMS Key. If using `aws.kms.Key`, use the exported `arn` attribute: `kms_key_id = aws_kms_key.foo.arn`
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request. Valid values are `COPY` and `REPLACE`.
     * 
     */
    @Import(name="metadataDirective")
    private @Nullable Output<String> metadataDirective;

    public Optional<Output<String>> metadataDirective() {
        return Optional.ofNullable(this.metadataDirective);
    }

    /**
     * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     * 
     */
    @Import(name="objectLockLegalHoldStatus")
    private @Nullable Output<String> objectLockLegalHoldStatus;

    public Optional<Output<String>> objectLockLegalHoldStatus() {
        return Optional.ofNullable(this.objectLockLegalHoldStatus);
    }

    /**
     * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    @Import(name="objectLockMode")
    private @Nullable Output<String> objectLockMode;

    public Optional<Output<String>> objectLockMode() {
        return Optional.ofNullable(this.objectLockMode);
    }

    /**
     * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object&#39;s object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     * 
     */
    @Import(name="objectLockRetainUntilDate")
    private @Nullable Output<String> objectLockRetainUntilDate;

    public Optional<Output<String>> objectLockRetainUntilDate() {
        return Optional.ofNullable(this.objectLockRetainUntilDate);
    }

    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from requester pays buckets, see Downloading Objects in Requestor Pays Buckets (https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html) in the Amazon S3 Developer Guide. If included, the only valid value is `requester`.
     * 
     */
    @Import(name="requestPayer")
    private @Nullable Output<String> requestPayer;

    public Optional<Output<String>> requestPayer() {
        return Optional.ofNullable(this.requestPayer);
    }

    /**
     * Specifies server-side encryption of the object in S3. Valid values are `AES256` and `aws:kms`.
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<String> serverSideEncryption;

    public Optional<Output<String>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * Specifies the source object for the copy operation. You specify the value in one of two formats. For objects not accessed through an access point, specify the name of the source bucket and the key of the source object, separated by a slash (`/`). For example, `testbucket/test1.json`. For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format `arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;`. For example, `arn:aws:s3:us-west-2:9999912999:accesspoint/my-access-point/object/testbucket/test1.json`.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    /**
     * Specifies the algorithm to use when decrypting the source object (for example, AES256).
     * 
     */
    @Import(name="sourceCustomerAlgorithm")
    private @Nullable Output<String> sourceCustomerAlgorithm;

    public Optional<Output<String>> sourceCustomerAlgorithm() {
        return Optional.ofNullable(this.sourceCustomerAlgorithm);
    }

    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
     * 
     */
    @Import(name="sourceCustomerKey")
    private @Nullable Output<String> sourceCustomerKey;

    public Optional<Output<String>> sourceCustomerKey() {
        return Optional.ofNullable(this.sourceCustomerKey);
    }

    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
     * 
     */
    @Import(name="sourceCustomerKeyMd5")
    private @Nullable Output<String> sourceCustomerKeyMd5;

    public Optional<Output<String>> sourceCustomerKeyMd5() {
        return Optional.ofNullable(this.sourceCustomerKeyMd5);
    }

    /**
     * Specifies the desired [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html#AmazonS3-CopyObject-request-header-StorageClass) for the object. Defaults to `STANDARD`.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    /**
     * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request. Valid values are `COPY` and `REPLACE`.
     * 
     */
    @Import(name="taggingDirective")
    private @Nullable Output<String> taggingDirective;

    public Optional<Output<String>> taggingDirective() {
        return Optional.ofNullable(this.taggingDirective);
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     */
    @Import(name="websiteRedirect")
    private @Nullable Output<String> websiteRedirect;

    public Optional<Output<String>> websiteRedirect() {
        return Optional.ofNullable(this.websiteRedirect);
    }

    private ObjectCopyArgs() {}

    private ObjectCopyArgs(ObjectCopyArgs $) {
        this.acl = $.acl;
        this.bucket = $.bucket;
        this.bucketKeyEnabled = $.bucketKeyEnabled;
        this.cacheControl = $.cacheControl;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLanguage = $.contentLanguage;
        this.contentType = $.contentType;
        this.copyIfMatch = $.copyIfMatch;
        this.copyIfModifiedSince = $.copyIfModifiedSince;
        this.copyIfNoneMatch = $.copyIfNoneMatch;
        this.copyIfUnmodifiedSince = $.copyIfUnmodifiedSince;
        this.customerAlgorithm = $.customerAlgorithm;
        this.customerKey = $.customerKey;
        this.customerKeyMd5 = $.customerKeyMd5;
        this.expectedBucketOwner = $.expectedBucketOwner;
        this.expectedSourceBucketOwner = $.expectedSourceBucketOwner;
        this.expires = $.expires;
        this.forceDestroy = $.forceDestroy;
        this.grants = $.grants;
        this.key = $.key;
        this.kmsEncryptionContext = $.kmsEncryptionContext;
        this.kmsKeyId = $.kmsKeyId;
        this.metadata = $.metadata;
        this.metadataDirective = $.metadataDirective;
        this.objectLockLegalHoldStatus = $.objectLockLegalHoldStatus;
        this.objectLockMode = $.objectLockMode;
        this.objectLockRetainUntilDate = $.objectLockRetainUntilDate;
        this.requestPayer = $.requestPayer;
        this.serverSideEncryption = $.serverSideEncryption;
        this.source = $.source;
        this.sourceCustomerAlgorithm = $.sourceCustomerAlgorithm;
        this.sourceCustomerKey = $.sourceCustomerKey;
        this.sourceCustomerKeyMd5 = $.sourceCustomerKeyMd5;
        this.storageClass = $.storageClass;
        this.taggingDirective = $.taggingDirective;
        this.tags = $.tags;
        this.websiteRedirect = $.websiteRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectCopyArgs $;

        public Builder() {
            $ = new ObjectCopyArgs();
        }

        public Builder(ObjectCopyArgs defaults) {
            $ = new ObjectCopyArgs(Objects.requireNonNull(defaults));
        }

        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder bucketKeyEnabled(@Nullable Output<Boolean> bucketKeyEnabled) {
            $.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        public Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            return bucketKeyEnabled(Output.of(bucketKeyEnabled));
        }

        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        public Builder cacheControl(String cacheControl) {
            return cacheControl(Output.of(cacheControl));
        }

        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        public Builder contentDisposition(String contentDisposition) {
            return contentDisposition(Output.of(contentDisposition));
        }

        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        public Builder contentLanguage(@Nullable Output<String> contentLanguage) {
            $.contentLanguage = contentLanguage;
            return this;
        }

        public Builder contentLanguage(String contentLanguage) {
            return contentLanguage(Output.of(contentLanguage));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder copyIfMatch(@Nullable Output<String> copyIfMatch) {
            $.copyIfMatch = copyIfMatch;
            return this;
        }

        public Builder copyIfMatch(String copyIfMatch) {
            return copyIfMatch(Output.of(copyIfMatch));
        }

        public Builder copyIfModifiedSince(@Nullable Output<String> copyIfModifiedSince) {
            $.copyIfModifiedSince = copyIfModifiedSince;
            return this;
        }

        public Builder copyIfModifiedSince(String copyIfModifiedSince) {
            return copyIfModifiedSince(Output.of(copyIfModifiedSince));
        }

        public Builder copyIfNoneMatch(@Nullable Output<String> copyIfNoneMatch) {
            $.copyIfNoneMatch = copyIfNoneMatch;
            return this;
        }

        public Builder copyIfNoneMatch(String copyIfNoneMatch) {
            return copyIfNoneMatch(Output.of(copyIfNoneMatch));
        }

        public Builder copyIfUnmodifiedSince(@Nullable Output<String> copyIfUnmodifiedSince) {
            $.copyIfUnmodifiedSince = copyIfUnmodifiedSince;
            return this;
        }

        public Builder copyIfUnmodifiedSince(String copyIfUnmodifiedSince) {
            return copyIfUnmodifiedSince(Output.of(copyIfUnmodifiedSince));
        }

        public Builder customerAlgorithm(@Nullable Output<String> customerAlgorithm) {
            $.customerAlgorithm = customerAlgorithm;
            return this;
        }

        public Builder customerAlgorithm(String customerAlgorithm) {
            return customerAlgorithm(Output.of(customerAlgorithm));
        }

        public Builder customerKey(@Nullable Output<String> customerKey) {
            $.customerKey = customerKey;
            return this;
        }

        public Builder customerKey(String customerKey) {
            return customerKey(Output.of(customerKey));
        }

        public Builder customerKeyMd5(@Nullable Output<String> customerKeyMd5) {
            $.customerKeyMd5 = customerKeyMd5;
            return this;
        }

        public Builder customerKeyMd5(String customerKeyMd5) {
            return customerKeyMd5(Output.of(customerKeyMd5));
        }

        public Builder expectedBucketOwner(@Nullable Output<String> expectedBucketOwner) {
            $.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        public Builder expectedBucketOwner(String expectedBucketOwner) {
            return expectedBucketOwner(Output.of(expectedBucketOwner));
        }

        public Builder expectedSourceBucketOwner(@Nullable Output<String> expectedSourceBucketOwner) {
            $.expectedSourceBucketOwner = expectedSourceBucketOwner;
            return this;
        }

        public Builder expectedSourceBucketOwner(String expectedSourceBucketOwner) {
            return expectedSourceBucketOwner(Output.of(expectedSourceBucketOwner));
        }

        public Builder expires(@Nullable Output<String> expires) {
            $.expires = expires;
            return this;
        }

        public Builder expires(String expires) {
            return expires(Output.of(expires));
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder grants(@Nullable Output<List<ObjectCopyGrantArgs>> grants) {
            $.grants = grants;
            return this;
        }

        public Builder grants(List<ObjectCopyGrantArgs> grants) {
            return grants(Output.of(grants));
        }

        public Builder grants(ObjectCopyGrantArgs... grants) {
            return grants(List.of(grants));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder kmsEncryptionContext(@Nullable Output<String> kmsEncryptionContext) {
            $.kmsEncryptionContext = kmsEncryptionContext;
            return this;
        }

        public Builder kmsEncryptionContext(String kmsEncryptionContext) {
            return kmsEncryptionContext(Output.of(kmsEncryptionContext));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder metadataDirective(@Nullable Output<String> metadataDirective) {
            $.metadataDirective = metadataDirective;
            return this;
        }

        public Builder metadataDirective(String metadataDirective) {
            return metadataDirective(Output.of(metadataDirective));
        }

        public Builder objectLockLegalHoldStatus(@Nullable Output<String> objectLockLegalHoldStatus) {
            $.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
            return this;
        }

        public Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
            return objectLockLegalHoldStatus(Output.of(objectLockLegalHoldStatus));
        }

        public Builder objectLockMode(@Nullable Output<String> objectLockMode) {
            $.objectLockMode = objectLockMode;
            return this;
        }

        public Builder objectLockMode(String objectLockMode) {
            return objectLockMode(Output.of(objectLockMode));
        }

        public Builder objectLockRetainUntilDate(@Nullable Output<String> objectLockRetainUntilDate) {
            $.objectLockRetainUntilDate = objectLockRetainUntilDate;
            return this;
        }

        public Builder objectLockRetainUntilDate(String objectLockRetainUntilDate) {
            return objectLockRetainUntilDate(Output.of(objectLockRetainUntilDate));
        }

        public Builder requestPayer(@Nullable Output<String> requestPayer) {
            $.requestPayer = requestPayer;
            return this;
        }

        public Builder requestPayer(String requestPayer) {
            return requestPayer(Output.of(requestPayer));
        }

        public Builder serverSideEncryption(@Nullable Output<String> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder serverSideEncryption(String serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder sourceCustomerAlgorithm(@Nullable Output<String> sourceCustomerAlgorithm) {
            $.sourceCustomerAlgorithm = sourceCustomerAlgorithm;
            return this;
        }

        public Builder sourceCustomerAlgorithm(String sourceCustomerAlgorithm) {
            return sourceCustomerAlgorithm(Output.of(sourceCustomerAlgorithm));
        }

        public Builder sourceCustomerKey(@Nullable Output<String> sourceCustomerKey) {
            $.sourceCustomerKey = sourceCustomerKey;
            return this;
        }

        public Builder sourceCustomerKey(String sourceCustomerKey) {
            return sourceCustomerKey(Output.of(sourceCustomerKey));
        }

        public Builder sourceCustomerKeyMd5(@Nullable Output<String> sourceCustomerKeyMd5) {
            $.sourceCustomerKeyMd5 = sourceCustomerKeyMd5;
            return this;
        }

        public Builder sourceCustomerKeyMd5(String sourceCustomerKeyMd5) {
            return sourceCustomerKeyMd5(Output.of(sourceCustomerKeyMd5));
        }

        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public Builder taggingDirective(@Nullable Output<String> taggingDirective) {
            $.taggingDirective = taggingDirective;
            return this;
        }

        public Builder taggingDirective(String taggingDirective) {
            return taggingDirective(Output.of(taggingDirective));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder websiteRedirect(@Nullable Output<String> websiteRedirect) {
            $.websiteRedirect = websiteRedirect;
            return this;
        }

        public Builder websiteRedirect(String websiteRedirect) {
            return websiteRedirect(Output.of(websiteRedirect));
        }

        public ObjectCopyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
