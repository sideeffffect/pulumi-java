// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.DataQualityJobDefinitionS3OutputS3UploadMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about where and how to store the results of a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionS3OutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionS3OutputArgs Empty = new DataQualityJobDefinitionS3OutputArgs();

    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
     * 
     */
    @Import(name="localPath", required=true)
    private Output<String> localPath;

    public Output<String> localPath() {
        return this.localPath;
    }

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * 
     */
    @Import(name="s3UploadMode")
    private @Nullable Output<DataQualityJobDefinitionS3OutputS3UploadMode> s3UploadMode;

    public Optional<Output<DataQualityJobDefinitionS3OutputS3UploadMode>> s3UploadMode() {
        return Optional.ofNullable(this.s3UploadMode);
    }

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    @Import(name="s3Uri", required=true)
    private Output<String> s3Uri;

    public Output<String> s3Uri() {
        return this.s3Uri;
    }

    private DataQualityJobDefinitionS3OutputArgs() {}

    private DataQualityJobDefinitionS3OutputArgs(DataQualityJobDefinitionS3OutputArgs $) {
        this.localPath = $.localPath;
        this.s3UploadMode = $.s3UploadMode;
        this.s3Uri = $.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityJobDefinitionS3OutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionS3OutputArgs $;

        public Builder() {
            $ = new DataQualityJobDefinitionS3OutputArgs();
        }

        public Builder(DataQualityJobDefinitionS3OutputArgs defaults) {
            $ = new DataQualityJobDefinitionS3OutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder localPath(Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        public Builder s3UploadMode(@Nullable Output<DataQualityJobDefinitionS3OutputS3UploadMode> s3UploadMode) {
            $.s3UploadMode = s3UploadMode;
            return this;
        }

        public Builder s3UploadMode(DataQualityJobDefinitionS3OutputS3UploadMode s3UploadMode) {
            return s3UploadMode(Output.of(s3UploadMode));
        }

        public Builder s3Uri(Output<String> s3Uri) {
            $.s3Uri = s3Uri;
            return this;
        }

        public Builder s3Uri(String s3Uri) {
            return s3Uri(Output.of(s3Uri));
        }

        public DataQualityJobDefinitionS3OutputArgs build() {
            $.localPath = Objects.requireNonNull($.localPath, "expected parameter 'localPath' to be non-null");
            $.s3Uri = Objects.requireNonNull($.s3Uri, "expected parameter 's3Uri' to be non-null");
            return $;
        }
    }

}
