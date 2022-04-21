// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs();

    /**
     * Provide this property when creating the disk.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the disk name. If not specified, the default is
     * to use the name of the instance. If the disk with the
     * instance name exists already in the given zone/region, a
     * new name will be automatically generated.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * Specifies the size of the disk in base-2 GB. If not
     * specified, the disk will be the same size as the image
     * (usually 10GB). If specified, the size must be equal to
     * or larger than 10GB. Default 100 GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * The type of the boot disk attached to this runtime,
     * defaults to standard persistent disk. For valid values,
     * see `https://cloud.google.com/vertex-ai/docs/workbench/
     * reference/rest/v1/projects.locations.runtimes#disktype`
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs() {}

    private RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs(RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs $) {
        this.description = $.description;
        this.diskName = $.diskName;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs $;

        public Builder() {
            $ = new RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs();
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs defaults) {
            $ = new RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs build() {
            return $;
        }
    }

}
