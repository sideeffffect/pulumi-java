// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsSharingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsSharingSettingsArgs Empty = new UserProfileUserSettingsSharingSettingsArgs();

    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is `Disabled`. Valid values are `Allowed` and `Disabled`.
     * 
     */
    @Import(name="notebookOutputOption")
      private final @Nullable Output<String> notebookOutputOption;

    public Output<String> notebookOutputOption() {
        return this.notebookOutputOption == null ? Codegen.empty() : this.notebookOutputOption;
    }

    /**
     * When `notebook_output_option` is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    @Import(name="s3KmsKeyId")
      private final @Nullable Output<String> s3KmsKeyId;

    public Output<String> s3KmsKeyId() {
        return this.s3KmsKeyId == null ? Codegen.empty() : this.s3KmsKeyId;
    }

    /**
     * When `notebook_output_option` is Allowed, the Amazon S3 bucket used to save the notebook cell output.
     * 
     */
    @Import(name="s3OutputPath")
      private final @Nullable Output<String> s3OutputPath;

    public Output<String> s3OutputPath() {
        return this.s3OutputPath == null ? Codegen.empty() : this.s3OutputPath;
    }

    public UserProfileUserSettingsSharingSettingsArgs(
        @Nullable Output<String> notebookOutputOption,
        @Nullable Output<String> s3KmsKeyId,
        @Nullable Output<String> s3OutputPath) {
        this.notebookOutputOption = notebookOutputOption;
        this.s3KmsKeyId = s3KmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    private UserProfileUserSettingsSharingSettingsArgs() {
        this.notebookOutputOption = Codegen.empty();
        this.s3KmsKeyId = Codegen.empty();
        this.s3OutputPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsSharingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> notebookOutputOption;
        private @Nullable Output<String> s3KmsKeyId;
        private @Nullable Output<String> s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsSharingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notebookOutputOption = defaults.notebookOutputOption;
    	      this.s3KmsKeyId = defaults.s3KmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder notebookOutputOption(@Nullable Output<String> notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }
        public Builder notebookOutputOption(@Nullable String notebookOutputOption) {
            this.notebookOutputOption = Codegen.ofNullable(notebookOutputOption);
            return this;
        }
        public Builder s3KmsKeyId(@Nullable Output<String> s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }
        public Builder s3KmsKeyId(@Nullable String s3KmsKeyId) {
            this.s3KmsKeyId = Codegen.ofNullable(s3KmsKeyId);
            return this;
        }
        public Builder s3OutputPath(@Nullable Output<String> s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }
        public Builder s3OutputPath(@Nullable String s3OutputPath) {
            this.s3OutputPath = Codegen.ofNullable(s3OutputPath);
            return this;
        }        public UserProfileUserSettingsSharingSettingsArgs build() {
            return new UserProfileUserSettingsSharingSettingsArgs(notebookOutputOption, s3KmsKeyId, s3OutputPath);
        }
    }
}
