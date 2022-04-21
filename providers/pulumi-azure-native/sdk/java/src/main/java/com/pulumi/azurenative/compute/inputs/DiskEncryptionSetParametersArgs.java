// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the parameter of customer managed disk encryption set resource id that can be specified for disk. &lt;br&gt;&lt;br&gt; NOTE: The disk encryption set resource id can only be specified for managed disk. Please refer https://aka.ms/mdssewithcmkoverview for more details.
 * 
 */
public final class DiskEncryptionSetParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionSetParametersArgs Empty = new DiskEncryptionSetParametersArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private DiskEncryptionSetParametersArgs() {}

    private DiskEncryptionSetParametersArgs(DiskEncryptionSetParametersArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskEncryptionSetParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskEncryptionSetParametersArgs $;

        public Builder() {
            $ = new DiskEncryptionSetParametersArgs();
        }

        public Builder(DiskEncryptionSetParametersArgs defaults) {
            $ = new DiskEncryptionSetParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public DiskEncryptionSetParametersArgs build() {
            return $;
        }
    }

}
