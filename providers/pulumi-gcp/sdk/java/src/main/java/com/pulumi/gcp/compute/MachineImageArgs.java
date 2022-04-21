// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.MachineImageMachineImageEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MachineImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final MachineImageArgs Empty = new MachineImageArgs();

    /**
     * A text description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @Import(name="guestFlush")
    private @Nullable Output<Boolean> guestFlush;

    public Optional<Output<Boolean>> guestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }

    /**
     * Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     * 
     */
    @Import(name="machineImageEncryptionKey")
    private @Nullable Output<MachineImageMachineImageEncryptionKeyArgs> machineImageEncryptionKey;

    public Optional<Output<MachineImageMachineImageEncryptionKeyArgs>> machineImageEncryptionKey() {
        return Optional.ofNullable(this.machineImageEncryptionKey);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     * 
     */
    @Import(name="sourceInstance", required=true)
    private Output<String> sourceInstance;

    public Output<String> sourceInstance() {
        return this.sourceInstance;
    }

    private MachineImageArgs() {}

    private MachineImageArgs(MachineImageArgs $) {
        this.description = $.description;
        this.guestFlush = $.guestFlush;
        this.machineImageEncryptionKey = $.machineImageEncryptionKey;
        this.name = $.name;
        this.project = $.project;
        this.sourceInstance = $.sourceInstance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineImageArgs $;

        public Builder() {
            $ = new MachineImageArgs();
        }

        public Builder(MachineImageArgs defaults) {
            $ = new MachineImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            $.guestFlush = guestFlush;
            return this;
        }

        public Builder guestFlush(Boolean guestFlush) {
            return guestFlush(Output.of(guestFlush));
        }

        public Builder machineImageEncryptionKey(@Nullable Output<MachineImageMachineImageEncryptionKeyArgs> machineImageEncryptionKey) {
            $.machineImageEncryptionKey = machineImageEncryptionKey;
            return this;
        }

        public Builder machineImageEncryptionKey(MachineImageMachineImageEncryptionKeyArgs machineImageEncryptionKey) {
            return machineImageEncryptionKey(Output.of(machineImageEncryptionKey));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sourceInstance(Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        public MachineImageArgs build() {
            $.sourceInstance = Objects.requireNonNull($.sourceInstance, "expected parameter 'sourceInstance' to be non-null");
            return $;
        }
    }

}
