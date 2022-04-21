// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicKeyArgs Empty = new GetPublicKeyArgs();

    /**
     * List of grant tokens
     * 
     */
    @Import(name="grantTokens")
    private @Nullable List<String> grantTokens;

    public Optional<List<String>> grantTokens() {
        return Optional.ofNullable(this.grantTokens);
    }

    /**
     * Key identifier which can be one of the following format:
     * * Key ID. E.g - `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN. E.g. - `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name. E.g. - `alias/my-key`
     * * Alias ARN - E.g. - `arn:aws:kms:us-east-1:111122223333:alias/my-key`
     * 
     */
    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    private GetPublicKeyArgs() {}

    private GetPublicKeyArgs(GetPublicKeyArgs $) {
        this.grantTokens = $.grantTokens;
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicKeyArgs $;

        public Builder() {
            $ = new GetPublicKeyArgs();
        }

        public Builder(GetPublicKeyArgs defaults) {
            $ = new GetPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder grantTokens(@Nullable List<String> grantTokens) {
            $.grantTokens = grantTokens;
            return this;
        }

        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public GetPublicKeyArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
