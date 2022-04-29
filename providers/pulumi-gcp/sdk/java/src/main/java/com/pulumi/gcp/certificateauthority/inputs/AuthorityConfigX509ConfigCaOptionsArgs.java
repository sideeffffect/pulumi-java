// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigCaOptionsArgs extends ResourceArgs {

    public static final AuthorityConfigX509ConfigCaOptionsArgs Empty = new AuthorityConfigX509ConfigCaOptionsArgs();

    /**
     * When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
     * 
     */
    @Import(name="isCa", required=true)
    private Output<Boolean> isCa;

    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
     * 
     */
    public Output<Boolean> isCa() {
        return this.isCa;
    }

    /**
     * Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    @Import(name="maxIssuerPathLength")
    private @Nullable Output<Integer> maxIssuerPathLength;

    /**
     * @return Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    public Optional<Output<Integer>> maxIssuerPathLength() {
        return Optional.ofNullable(this.maxIssuerPathLength);
    }

    /**
     * When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    @Import(name="nonCa")
    private @Nullable Output<Boolean> nonCa;

    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    public Optional<Output<Boolean>> nonCa() {
        return Optional.ofNullable(this.nonCa);
    }

    /**
     * When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    @Import(name="zeroMaxIssuerPathLength")
    private @Nullable Output<Boolean> zeroMaxIssuerPathLength;

    /**
     * @return When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    public Optional<Output<Boolean>> zeroMaxIssuerPathLength() {
        return Optional.ofNullable(this.zeroMaxIssuerPathLength);
    }

    private AuthorityConfigX509ConfigCaOptionsArgs() {}

    private AuthorityConfigX509ConfigCaOptionsArgs(AuthorityConfigX509ConfigCaOptionsArgs $) {
        this.isCa = $.isCa;
        this.maxIssuerPathLength = $.maxIssuerPathLength;
        this.nonCa = $.nonCa;
        this.zeroMaxIssuerPathLength = $.zeroMaxIssuerPathLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityConfigX509ConfigCaOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigX509ConfigCaOptionsArgs $;

        public Builder() {
            $ = new AuthorityConfigX509ConfigCaOptionsArgs();
        }

        public Builder(AuthorityConfigX509ConfigCaOptionsArgs defaults) {
            $ = new AuthorityConfigX509ConfigCaOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isCa When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
         * 
         * @return builder
         * 
         */
        public Builder isCa(Output<Boolean> isCa) {
            $.isCa = isCa;
            return this;
        }

        /**
         * @param isCa When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
         * 
         * @return builder
         * 
         */
        public Builder isCa(Boolean isCa) {
            return isCa(Output.of(isCa));
        }

        /**
         * @param maxIssuerPathLength Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
         * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
         * 
         * @return builder
         * 
         */
        public Builder maxIssuerPathLength(@Nullable Output<Integer> maxIssuerPathLength) {
            $.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }

        /**
         * @param maxIssuerPathLength Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
         * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
         * 
         * @return builder
         * 
         */
        public Builder maxIssuerPathLength(Integer maxIssuerPathLength) {
            return maxIssuerPathLength(Output.of(maxIssuerPathLength));
        }

        /**
         * @param nonCa When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
         * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder nonCa(@Nullable Output<Boolean> nonCa) {
            $.nonCa = nonCa;
            return this;
        }

        /**
         * @param nonCa When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
         * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder nonCa(Boolean nonCa) {
            return nonCa(Output.of(nonCa));
        }

        /**
         * @param zeroMaxIssuerPathLength When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
         * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
         * the max path length will be omitted from the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder zeroMaxIssuerPathLength(@Nullable Output<Boolean> zeroMaxIssuerPathLength) {
            $.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
            return this;
        }

        /**
         * @param zeroMaxIssuerPathLength When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
         * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
         * the max path length will be omitted from the CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder zeroMaxIssuerPathLength(Boolean zeroMaxIssuerPathLength) {
            return zeroMaxIssuerPathLength(Output.of(zeroMaxIssuerPathLength));
        }

        public AuthorityConfigX509ConfigCaOptionsArgs build() {
            $.isCa = Objects.requireNonNull($.isCa, "expected parameter 'isCa' to be non-null");
            return $;
        }
    }

}
