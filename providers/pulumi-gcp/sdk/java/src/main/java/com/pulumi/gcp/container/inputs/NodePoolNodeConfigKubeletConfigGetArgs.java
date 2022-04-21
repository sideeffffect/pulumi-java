// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigKubeletConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigKubeletConfigGetArgs Empty = new NodePoolNodeConfigKubeletConfigGetArgs();

    @Import(name="cpuCfsQuota")
    private @Nullable Output<Boolean> cpuCfsQuota;

    public Optional<Output<Boolean>> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }

    @Import(name="cpuCfsQuotaPeriod")
    private @Nullable Output<String> cpuCfsQuotaPeriod;

    public Optional<Output<String>> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }

    @Import(name="cpuManagerPolicy", required=true)
    private Output<String> cpuManagerPolicy;

    public Output<String> cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    private NodePoolNodeConfigKubeletConfigGetArgs() {}

    private NodePoolNodeConfigKubeletConfigGetArgs(NodePoolNodeConfigKubeletConfigGetArgs $) {
        this.cpuCfsQuota = $.cpuCfsQuota;
        this.cpuCfsQuotaPeriod = $.cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = $.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigKubeletConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigKubeletConfigGetArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigKubeletConfigGetArgs();
        }

        public Builder(NodePoolNodeConfigKubeletConfigGetArgs defaults) {
            $ = new NodePoolNodeConfigKubeletConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            $.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            return cpuCfsQuota(Output.of(cpuCfsQuota));
        }

        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            $.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            return cpuCfsQuotaPeriod(Output.of(cpuCfsQuotaPeriod));
        }

        public Builder cpuManagerPolicy(Output<String> cpuManagerPolicy) {
            $.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            return cpuManagerPolicy(Output.of(cpuManagerPolicy));
        }

        public NodePoolNodeConfigKubeletConfigGetArgs build() {
            $.cpuManagerPolicy = Objects.requireNonNull($.cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
            return $;
        }
    }

}
