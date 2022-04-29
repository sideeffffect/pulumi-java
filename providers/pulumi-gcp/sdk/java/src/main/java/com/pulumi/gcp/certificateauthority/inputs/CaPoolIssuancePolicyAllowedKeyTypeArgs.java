// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeRsaArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyAllowedKeyTypeArgs extends ResourceArgs {

    public static final CaPoolIssuancePolicyAllowedKeyTypeArgs Empty = new CaPoolIssuancePolicyAllowedKeyTypeArgs();

    /**
     * Represents an allowed Elliptic Curve key type.
     * Structure is documented below.
     * 
     */
    @Import(name="ellipticCurve")
    private @Nullable Output<CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs> ellipticCurve;

    /**
     * @return Represents an allowed Elliptic Curve key type.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs>> ellipticCurve() {
        return Optional.ofNullable(this.ellipticCurve);
    }

    /**
     * Describes an RSA key that may be used in a Certificate issued from a CaPool.
     * Structure is documented below.
     * 
     */
    @Import(name="rsa")
    private @Nullable Output<CaPoolIssuancePolicyAllowedKeyTypeRsaArgs> rsa;

    /**
     * @return Describes an RSA key that may be used in a Certificate issued from a CaPool.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CaPoolIssuancePolicyAllowedKeyTypeRsaArgs>> rsa() {
        return Optional.ofNullable(this.rsa);
    }

    private CaPoolIssuancePolicyAllowedKeyTypeArgs() {}

    private CaPoolIssuancePolicyAllowedKeyTypeArgs(CaPoolIssuancePolicyAllowedKeyTypeArgs $) {
        this.ellipticCurve = $.ellipticCurve;
        this.rsa = $.rsa;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaPoolIssuancePolicyAllowedKeyTypeArgs $;

        public Builder() {
            $ = new CaPoolIssuancePolicyAllowedKeyTypeArgs();
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeArgs defaults) {
            $ = new CaPoolIssuancePolicyAllowedKeyTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ellipticCurve Represents an allowed Elliptic Curve key type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ellipticCurve(@Nullable Output<CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs> ellipticCurve) {
            $.ellipticCurve = ellipticCurve;
            return this;
        }

        /**
         * @param ellipticCurve Represents an allowed Elliptic Curve key type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ellipticCurve(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs ellipticCurve) {
            return ellipticCurve(Output.of(ellipticCurve));
        }

        /**
         * @param rsa Describes an RSA key that may be used in a Certificate issued from a CaPool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rsa(@Nullable Output<CaPoolIssuancePolicyAllowedKeyTypeRsaArgs> rsa) {
            $.rsa = rsa;
            return this;
        }

        /**
         * @param rsa Describes an RSA key that may be used in a Certificate issued from a CaPool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rsa(CaPoolIssuancePolicyAllowedKeyTypeRsaArgs rsa) {
            return rsa(Output.of(rsa));
        }

        public CaPoolIssuancePolicyAllowedKeyTypeArgs build() {
            return $;
        }
    }

}
