// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca.v1.inputs.ExtendedKeyUsageOptionsArgs;
import com.pulumi.googlenative.privateca.v1.inputs.KeyUsageOptionsArgs;
import com.pulumi.googlenative.privateca.v1.inputs.ObjectIdArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A KeyUsage describes key usage values that may appear in an X.509 certificate.
 * 
 */
public final class KeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyUsageArgs Empty = new KeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @Import(name="baseKeyUsage")
    private @Nullable Output<KeyUsageOptionsArgs> baseKeyUsage;

    /**
     * @return Describes high-level ways in which a key may be used.
     * 
     */
    public Optional<Output<KeyUsageOptionsArgs>> baseKeyUsage() {
        return Optional.ofNullable(this.baseKeyUsage);
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @Import(name="extendedKeyUsage")
    private @Nullable Output<ExtendedKeyUsageOptionsArgs> extendedKeyUsage;

    /**
     * @return Detailed scenarios in which a key may be used.
     * 
     */
    public Optional<Output<ExtendedKeyUsageOptionsArgs>> extendedKeyUsage() {
        return Optional.ofNullable(this.extendedKeyUsage);
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
    private @Nullable Output<List<ObjectIdArgs>> unknownExtendedKeyUsages;

    /**
     * @return Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    public Optional<Output<List<ObjectIdArgs>>> unknownExtendedKeyUsages() {
        return Optional.ofNullable(this.unknownExtendedKeyUsages);
    }

    private KeyUsageArgs() {}

    private KeyUsageArgs(KeyUsageArgs $) {
        this.baseKeyUsage = $.baseKeyUsage;
        this.extendedKeyUsage = $.extendedKeyUsage;
        this.unknownExtendedKeyUsages = $.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyUsageArgs $;

        public Builder() {
            $ = new KeyUsageArgs();
        }

        public Builder(KeyUsageArgs defaults) {
            $ = new KeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(@Nullable Output<KeyUsageOptionsArgs> baseKeyUsage) {
            $.baseKeyUsage = baseKeyUsage;
            return this;
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(KeyUsageOptionsArgs baseKeyUsage) {
            return baseKeyUsage(Output.of(baseKeyUsage));
        }

        /**
         * @param extendedKeyUsage Detailed scenarios in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(@Nullable Output<ExtendedKeyUsageOptionsArgs> extendedKeyUsage) {
            $.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        /**
         * @param extendedKeyUsage Detailed scenarios in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(ExtendedKeyUsageOptionsArgs extendedKeyUsage) {
            return extendedKeyUsage(Output.of(extendedKeyUsage));
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<ObjectIdArgs>> unknownExtendedKeyUsages) {
            $.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(List<ObjectIdArgs> unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(Output.of(unknownExtendedKeyUsages));
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(ObjectIdArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }

        public KeyUsageArgs build() {
            return $;
        }
    }

}
