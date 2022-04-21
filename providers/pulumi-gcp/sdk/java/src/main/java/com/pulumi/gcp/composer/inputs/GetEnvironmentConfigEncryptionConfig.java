// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentConfigEncryptionConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigEncryptionConfig Empty = new GetEnvironmentConfigEncryptionConfig();

    @Import(name="kmsKeyName", required=true)
    private String kmsKeyName;

    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    private GetEnvironmentConfigEncryptionConfig() {}

    private GetEnvironmentConfigEncryptionConfig(GetEnvironmentConfigEncryptionConfig $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentConfigEncryptionConfig $;

        public Builder() {
            $ = new GetEnvironmentConfigEncryptionConfig();
        }

        public Builder(GetEnvironmentConfigEncryptionConfig defaults) {
            $ = new GetEnvironmentConfigEncryptionConfig(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyName(String kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public GetEnvironmentConfigEncryptionConfig build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}
