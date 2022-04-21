// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureClusterWorkloadIdentityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterWorkloadIdentityConfigArgs Empty = new AzureClusterWorkloadIdentityConfigArgs();

    @Import(name="identityProvider")
    private @Nullable Output<String> identityProvider;

    public Optional<Output<String>> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }

    @Import(name="issuerUri")
    private @Nullable Output<String> issuerUri;

    public Optional<Output<String>> issuerUri() {
        return Optional.ofNullable(this.issuerUri);
    }

    @Import(name="workloadPool")
    private @Nullable Output<String> workloadPool;

    public Optional<Output<String>> workloadPool() {
        return Optional.ofNullable(this.workloadPool);
    }

    private AzureClusterWorkloadIdentityConfigArgs() {}

    private AzureClusterWorkloadIdentityConfigArgs(AzureClusterWorkloadIdentityConfigArgs $) {
        this.identityProvider = $.identityProvider;
        this.issuerUri = $.issuerUri;
        this.workloadPool = $.workloadPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterWorkloadIdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterWorkloadIdentityConfigArgs $;

        public Builder() {
            $ = new AzureClusterWorkloadIdentityConfigArgs();
        }

        public Builder(AzureClusterWorkloadIdentityConfigArgs defaults) {
            $ = new AzureClusterWorkloadIdentityConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder identityProvider(@Nullable Output<String> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        public Builder identityProvider(String identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        public Builder issuerUri(@Nullable Output<String> issuerUri) {
            $.issuerUri = issuerUri;
            return this;
        }

        public Builder issuerUri(String issuerUri) {
            return issuerUri(Output.of(issuerUri));
        }

        public Builder workloadPool(@Nullable Output<String> workloadPool) {
            $.workloadPool = workloadPool;
            return this;
        }

        public Builder workloadPool(String workloadPool) {
            return workloadPool(Output.of(workloadPool));
        }

        public AzureClusterWorkloadIdentityConfigArgs build() {
            return $;
        }
    }

}
