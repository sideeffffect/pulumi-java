// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyIAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMMemberState Empty = new CryptoKeyIAMMemberState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition;

    public Optional<Output<CryptoKeyIAMMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider&#39;s project setting will be used as a fallback.
     * 
     */
    @Import(name="cryptoKeyId")
    private @Nullable Output<String> cryptoKeyId;

    public Optional<Output<String>> cryptoKeyId() {
        return Optional.ofNullable(this.cryptoKeyId);
    }

    /**
     * (Computed) The etag of the project&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private CryptoKeyIAMMemberState() {}

    private CryptoKeyIAMMemberState(CryptoKeyIAMMemberState $) {
        this.condition = $.condition;
        this.cryptoKeyId = $.cryptoKeyId;
        this.etag = $.etag;
        this.member = $.member;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyIAMMemberState $;

        public Builder() {
            $ = new CryptoKeyIAMMemberState();
        }

        public Builder(CryptoKeyIAMMemberState defaults) {
            $ = new CryptoKeyIAMMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(CryptoKeyIAMMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder cryptoKeyId(@Nullable Output<String> cryptoKeyId) {
            $.cryptoKeyId = cryptoKeyId;
            return this;
        }

        public Builder cryptoKeyId(String cryptoKeyId) {
            return cryptoKeyId(Output.of(cryptoKeyId));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public CryptoKeyIAMMemberState build() {
            return $;
        }
    }

}
