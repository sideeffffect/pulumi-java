// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a VM from which a formula is to be created.
 * 
 */
public final class FormulaPropertiesFromVmArgs extends com.pulumi.resources.ResourceArgs {

    public static final FormulaPropertiesFromVmArgs Empty = new FormulaPropertiesFromVmArgs();

    /**
     * The identifier of the VM from which a formula is to be created.
     * 
     */
    @Import(name="labVmId")
    private @Nullable Output<String> labVmId;

    /**
     * @return The identifier of the VM from which a formula is to be created.
     * 
     */
    public Optional<Output<String>> labVmId() {
        return Optional.ofNullable(this.labVmId);
    }

    private FormulaPropertiesFromVmArgs() {}

    private FormulaPropertiesFromVmArgs(FormulaPropertiesFromVmArgs $) {
        this.labVmId = $.labVmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FormulaPropertiesFromVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FormulaPropertiesFromVmArgs $;

        public Builder() {
            $ = new FormulaPropertiesFromVmArgs();
        }

        public Builder(FormulaPropertiesFromVmArgs defaults) {
            $ = new FormulaPropertiesFromVmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labVmId The identifier of the VM from which a formula is to be created.
         * 
         * @return builder
         * 
         */
        public Builder labVmId(@Nullable Output<String> labVmId) {
            $.labVmId = labVmId;
            return this;
        }

        /**
         * @param labVmId The identifier of the VM from which a formula is to be created.
         * 
         * @return builder
         * 
         */
        public Builder labVmId(String labVmId) {
            return labVmId(Output.of(labVmId));
        }

        public FormulaPropertiesFromVmArgs build() {
            return $;
        }
    }

}
