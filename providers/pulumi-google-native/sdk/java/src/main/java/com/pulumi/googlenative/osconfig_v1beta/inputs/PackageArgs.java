// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.enums.PackageDesiredState;
import com.pulumi.googlenative.osconfig_v1beta.enums.PackageManager;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Package is a reference to the software package to be installed or removed. The agent on the VM instance uses the system package manager to apply the config. These are the commands that the agent uses to install or remove packages. Apt install: `apt-get update &amp;&amp; apt-get -y install package1 package2 package3` remove: `apt-get -y remove package1 package2 package3` Yum install: `yum -y install package1 package2 package3` remove: `yum -y remove package1 package2 package3` Zypper install: `zypper install package1 package2 package3` remove: `zypper rm package1 package2` Googet install: `googet -noconfirm install package1 package2 package3` remove: `googet -noconfirm remove package1 package2 package3`
 * 
 */
public final class PackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageArgs Empty = new PackageArgs();

    /**
     * The desired_state the agent should maintain for this package. The default is to ensure the package is installed.
     * 
     */
    @Import(name="desiredState")
    private @Nullable Output<PackageDesiredState> desiredState;

    public Optional<Output<PackageDesiredState>> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }

    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager, the package is not installed or removed no error message is returned. By default, or if you specify `ANY`, the agent attempts to install and remove this package using the default package manager. This is useful when creating a policy that applies to different types of systems. The default behavior is ANY.
     * 
     */
    @Import(name="manager")
    private @Nullable Output<PackageManager> manager;

    public Optional<Output<PackageManager>> manager() {
        return Optional.ofNullable(this.manager);
    }

    /**
     * The name of the package. A package is uniquely identified for conflict validation by checking the package name and the manager(s) that the package targets.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private PackageArgs() {}

    private PackageArgs(PackageArgs $) {
        this.desiredState = $.desiredState;
        this.manager = $.manager;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageArgs $;

        public Builder() {
            $ = new PackageArgs();
        }

        public Builder(PackageArgs defaults) {
            $ = new PackageArgs(Objects.requireNonNull(defaults));
        }

        public Builder desiredState(@Nullable Output<PackageDesiredState> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        public Builder desiredState(PackageDesiredState desiredState) {
            return desiredState(Output.of(desiredState));
        }

        public Builder manager(@Nullable Output<PackageManager> manager) {
            $.manager = manager;
            return this;
        }

        public Builder manager(PackageManager manager) {
            return manager(Output.of(manager));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PackageArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
