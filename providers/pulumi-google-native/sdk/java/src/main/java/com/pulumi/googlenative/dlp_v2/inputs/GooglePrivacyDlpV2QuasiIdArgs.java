// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GoogleProtobufEmptyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A column with a semantic tag attached.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2QuasiIdArgs Empty = new GooglePrivacyDlpV2QuasiIdArgs();

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    @Import(name="customTag")
    private @Nullable Output<String> customTag;

    public Optional<Output<String>> customTag() {
        return Optional.ofNullable(this.customTag);
    }

    /**
     * Identifies the column.
     * 
     */
    @Import(name="field", required=true)
    private Output<GooglePrivacyDlpV2FieldIdArgs> field;

    public Output<GooglePrivacyDlpV2FieldIdArgs> field() {
        return this.field;
    }

    /**
     * If no semantic tag is indicated, we infer the statistical model from the distribution of values in the input data
     * 
     */
    @Import(name="inferred")
    private @Nullable Output<GoogleProtobufEmptyArgs> inferred;

    public Optional<Output<GoogleProtobufEmptyArgs>> inferred() {
        return Optional.ofNullable(this.inferred);
    }

    /**
     * A column can be tagged with a InfoType to use the relevant public dataset as a statistical model of population, if available. We currently support US ZIP codes, region codes, ages and genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
     * 
     */
    @Import(name="infoType")
    private @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType;

    public Optional<Output<GooglePrivacyDlpV2InfoTypeArgs>> infoType() {
        return Optional.ofNullable(this.infoType);
    }

    private GooglePrivacyDlpV2QuasiIdArgs() {}

    private GooglePrivacyDlpV2QuasiIdArgs(GooglePrivacyDlpV2QuasiIdArgs $) {
        this.customTag = $.customTag;
        this.field = $.field;
        this.inferred = $.inferred;
        this.infoType = $.infoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2QuasiIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2QuasiIdArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2QuasiIdArgs();
        }

        public Builder(GooglePrivacyDlpV2QuasiIdArgs defaults) {
            $ = new GooglePrivacyDlpV2QuasiIdArgs(Objects.requireNonNull(defaults));
        }

        public Builder customTag(@Nullable Output<String> customTag) {
            $.customTag = customTag;
            return this;
        }

        public Builder customTag(String customTag) {
            return customTag(Output.of(customTag));
        }

        public Builder field(Output<GooglePrivacyDlpV2FieldIdArgs> field) {
            $.field = field;
            return this;
        }

        public Builder field(GooglePrivacyDlpV2FieldIdArgs field) {
            return field(Output.of(field));
        }

        public Builder inferred(@Nullable Output<GoogleProtobufEmptyArgs> inferred) {
            $.inferred = inferred;
            return this;
        }

        public Builder inferred(GoogleProtobufEmptyArgs inferred) {
            return inferred(Output.of(inferred));
        }

        public Builder infoType(@Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType) {
            $.infoType = infoType;
            return this;
        }

        public Builder infoType(GooglePrivacyDlpV2InfoTypeArgs infoType) {
            return infoType(Output.of(infoType));
        }

        public GooglePrivacyDlpV2QuasiIdArgs build() {
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            return $;
        }
    }

}
