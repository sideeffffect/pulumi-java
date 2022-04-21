// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeResourceStatementRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs Empty = new NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs();

    @Import(name="resourceStatement")
    private @Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement;

    public Optional<Output<NetworkInsightsAccessScopeResourceStatementRequestArgs>> resourceStatement() {
        return Optional.ofNullable(this.resourceStatement);
    }

    private NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs() {}

    private NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs(NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs $) {
        this.resourceStatement = $.resourceStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs $;

        public Builder() {
            $ = new NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs();
        }

        public Builder(NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs defaults) {
            $ = new NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceStatement(@Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement) {
            $.resourceStatement = resourceStatement;
            return this;
        }

        public Builder resourceStatement(NetworkInsightsAccessScopeResourceStatementRequestArgs resourceStatement) {
            return resourceStatement(Output.of(resourceStatement));
        }

        public NetworkInsightsAccessScopeThroughResourcesStatementRequestArgs build() {
            return $;
        }
    }

}
