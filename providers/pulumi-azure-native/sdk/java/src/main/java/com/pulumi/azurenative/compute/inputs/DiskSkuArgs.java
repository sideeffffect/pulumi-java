// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.DiskStorageAccountTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
 * 
 */
public final class DiskSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskSkuArgs Empty = new DiskSkuArgs();

    /**
     * The sku name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,DiskStorageAccountTypes>> name;

    public Optional<Output<Either<String,DiskStorageAccountTypes>>> name() {
        return Optional.ofNullable(this.name);
    }

    private DiskSkuArgs() {}

    private DiskSkuArgs(DiskSkuArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskSkuArgs $;

        public Builder() {
            $ = new DiskSkuArgs();
        }

        public Builder(DiskSkuArgs defaults) {
            $ = new DiskSkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<Either<String,DiskStorageAccountTypes>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,DiskStorageAccountTypes> name) {
            return name(Output.of(name));
        }

        public DiskSkuArgs build() {
            return $;
        }
    }

}
