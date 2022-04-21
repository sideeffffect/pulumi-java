// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallArgs Empty = new GetFirewallArgs();

    @Import(name="firewall", required=true)
    private String firewall;

    public String firewall() {
        return this.firewall;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFirewallArgs() {}

    private GetFirewallArgs(GetFirewallArgs $) {
        this.firewall = $.firewall;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallArgs $;

        public Builder() {
            $ = new GetFirewallArgs();
        }

        public Builder(GetFirewallArgs defaults) {
            $ = new GetFirewallArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewall(String firewall) {
            $.firewall = firewall;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetFirewallArgs build() {
            $.firewall = Objects.requireNonNull($.firewall, "expected parameter 'firewall' to be non-null");
            return $;
        }
    }

}
