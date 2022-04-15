// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigKubeletConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigKubeletConfigArgs Empty = new NodePoolNodeConfigKubeletConfigArgs();

    @Import(name="cpuCfsQuota")
      private final @Nullable Output<Boolean> cpuCfsQuota;

    public Output<Boolean> cpuCfsQuota() {
        return this.cpuCfsQuota == null ? Codegen.empty() : this.cpuCfsQuota;
    }

    @Import(name="cpuCfsQuotaPeriod")
      private final @Nullable Output<String> cpuCfsQuotaPeriod;

    public Output<String> cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Codegen.empty() : this.cpuCfsQuotaPeriod;
    }

    @Import(name="cpuManagerPolicy", required=true)
      private final Output<String> cpuManagerPolicy;

    public Output<String> cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public NodePoolNodeConfigKubeletConfigArgs(
        @Nullable Output<Boolean> cpuCfsQuota,
        @Nullable Output<String> cpuCfsQuotaPeriod,
        Output<String> cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
    }

    private NodePoolNodeConfigKubeletConfigArgs() {
        this.cpuCfsQuota = Codegen.empty();
        this.cpuCfsQuotaPeriod = Codegen.empty();
        this.cpuManagerPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigKubeletConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cpuCfsQuota;
        private @Nullable Output<String> cpuCfsQuotaPeriod;
        private Output<String> cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigKubeletConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Codegen.ofNullable(cpuCfsQuota);
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Codegen.ofNullable(cpuCfsQuotaPeriod);
            return this;
        }
        public Builder cpuManagerPolicy(Output<String> cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Output.of(Objects.requireNonNull(cpuManagerPolicy));
            return this;
        }        public NodePoolNodeConfigKubeletConfigArgs build() {
            return new NodePoolNodeConfigKubeletConfigArgs(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
