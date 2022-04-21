// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs;
import com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigState extends com.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigState Empty = new FieldLevelEncryptionConfigState();

    /**
     * Internal value used by CloudFront to allow future updates to the Field Level Encryption Config.
     * 
     */
    @Import(name="callerReference")
    private @Nullable Output<String> callerReference;

    public Optional<Output<String>> callerReference() {
        return Optional.ofNullable(this.callerReference);
    }

    /**
     * An optional comment about the Field Level Encryption Config.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Content Type Profile Config specifies when to forward content if a content type isn&#39;t recognized and profiles to use as by default in a request if a query argument doesn&#39;t specify a profile to use.
     * 
     */
    @Import(name="contentTypeProfileConfig")
    private @Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig;

    public Optional<Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs>> contentTypeProfileConfig() {
        return Optional.ofNullable(this.contentTypeProfileConfig);
    }

    /**
     * The current version of the Field Level Encryption Config. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Query Arg Profile Config that specifies when to forward content if a profile isn&#39;t found and the profile that can be provided as a query argument in a request.
     * 
     */
    @Import(name="queryArgProfileConfig")
    private @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig;

    public Optional<Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs>> queryArgProfileConfig() {
        return Optional.ofNullable(this.queryArgProfileConfig);
    }

    private FieldLevelEncryptionConfigState() {}

    private FieldLevelEncryptionConfigState(FieldLevelEncryptionConfigState $) {
        this.callerReference = $.callerReference;
        this.comment = $.comment;
        this.contentTypeProfileConfig = $.contentTypeProfileConfig;
        this.etag = $.etag;
        this.queryArgProfileConfig = $.queryArgProfileConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldLevelEncryptionConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionConfigState $;

        public Builder() {
            $ = new FieldLevelEncryptionConfigState();
        }

        public Builder(FieldLevelEncryptionConfigState defaults) {
            $ = new FieldLevelEncryptionConfigState(Objects.requireNonNull(defaults));
        }

        public Builder callerReference(@Nullable Output<String> callerReference) {
            $.callerReference = callerReference;
            return this;
        }

        public Builder callerReference(String callerReference) {
            return callerReference(Output.of(callerReference));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder contentTypeProfileConfig(@Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig) {
            $.contentTypeProfileConfig = contentTypeProfileConfig;
            return this;
        }

        public Builder contentTypeProfileConfig(FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs contentTypeProfileConfig) {
            return contentTypeProfileConfig(Output.of(contentTypeProfileConfig));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder queryArgProfileConfig(@Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig) {
            $.queryArgProfileConfig = queryArgProfileConfig;
            return this;
        }

        public Builder queryArgProfileConfig(FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs queryArgProfileConfig) {
            return queryArgProfileConfig(Output.of(queryArgProfileConfig));
        }

        public FieldLevelEncryptionConfigState build() {
            return $;
        }
    }

}
