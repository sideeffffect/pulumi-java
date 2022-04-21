// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScopeAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScopeAssignmentArgs Empty = new ScopeAssignmentArgs();

    /**
     * The managed network ID with scope will be assigned to.
     * 
     */
    @Import(name="assignedManagedNetwork")
    private @Nullable Output<String> assignedManagedNetwork;

    public Optional<Output<String>> assignedManagedNetwork() {
        return Optional.ofNullable(this.assignedManagedNetwork);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The base resource of the scope assignment to create. The scope can be any REST resource instance. For example, use &#39;subscriptions/{subscription-id}&#39; for a subscription, &#39;subscriptions/{subscription-id}/resourceGroups/{resource-group-name}&#39; for a resource group, and &#39;subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}&#39; for a resource.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The name of the scope assignment to create.
     * 
     */
    @Import(name="scopeAssignmentName")
    private @Nullable Output<String> scopeAssignmentName;

    public Optional<Output<String>> scopeAssignmentName() {
        return Optional.ofNullable(this.scopeAssignmentName);
    }

    private ScopeAssignmentArgs() {}

    private ScopeAssignmentArgs(ScopeAssignmentArgs $) {
        this.assignedManagedNetwork = $.assignedManagedNetwork;
        this.location = $.location;
        this.scope = $.scope;
        this.scopeAssignmentName = $.scopeAssignmentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScopeAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScopeAssignmentArgs $;

        public Builder() {
            $ = new ScopeAssignmentArgs();
        }

        public Builder(ScopeAssignmentArgs defaults) {
            $ = new ScopeAssignmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder assignedManagedNetwork(@Nullable Output<String> assignedManagedNetwork) {
            $.assignedManagedNetwork = assignedManagedNetwork;
            return this;
        }

        public Builder assignedManagedNetwork(String assignedManagedNetwork) {
            return assignedManagedNetwork(Output.of(assignedManagedNetwork));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder scopeAssignmentName(@Nullable Output<String> scopeAssignmentName) {
            $.scopeAssignmentName = scopeAssignmentName;
            return this;
        }

        public Builder scopeAssignmentName(String scopeAssignmentName) {
            return scopeAssignmentName(Output.of(scopeAssignmentName));
        }

        public ScopeAssignmentArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
