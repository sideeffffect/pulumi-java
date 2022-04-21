// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.inputs;

import com.pulumi.awsnative.athena.enums.WorkGroupEncryptionOption;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information.
 * 
 */
public final class WorkGroupEncryptionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final WorkGroupEncryptionConfiguration Empty = new WorkGroupEncryptionConfiguration();

    @Import(name="encryptionOption", required=true)
    private WorkGroupEncryptionOption encryptionOption;

    public WorkGroupEncryptionOption encryptionOption() {
        return this.encryptionOption;
    }

    @Import(name="kmsKey")
    private @Nullable String kmsKey;

    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    private WorkGroupEncryptionConfiguration() {}

    private WorkGroupEncryptionConfiguration(WorkGroupEncryptionConfiguration $) {
        this.encryptionOption = $.encryptionOption;
        this.kmsKey = $.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkGroupEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkGroupEncryptionConfiguration $;

        public Builder() {
            $ = new WorkGroupEncryptionConfiguration();
        }

        public Builder(WorkGroupEncryptionConfiguration defaults) {
            $ = new WorkGroupEncryptionConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder encryptionOption(WorkGroupEncryptionOption encryptionOption) {
            $.encryptionOption = encryptionOption;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public WorkGroupEncryptionConfiguration build() {
            $.encryptionOption = Objects.requireNonNull($.encryptionOption, "expected parameter 'encryptionOption' to be non-null");
            return $;
        }
    }

}
