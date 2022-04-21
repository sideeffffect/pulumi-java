// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    @Import(name="applicationIdentifier", required=true)
    private String applicationIdentifier;

    public String applicationIdentifier() {
        return this.applicationIdentifier;
    }

    @Import(name="environmentIdentifier", required=true)
    private String environmentIdentifier;

    public String environmentIdentifier() {
        return this.environmentIdentifier;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.applicationIdentifier = $.applicationIdentifier;
        this.environmentIdentifier = $.environmentIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationIdentifier(String applicationIdentifier) {
            $.applicationIdentifier = applicationIdentifier;
            return this;
        }

        public Builder environmentIdentifier(String environmentIdentifier) {
            $.environmentIdentifier = environmentIdentifier;
            return this;
        }

        public GetApplicationArgs build() {
            $.applicationIdentifier = Objects.requireNonNull($.applicationIdentifier, "expected parameter 'applicationIdentifier' to be non-null");
            $.environmentIdentifier = Objects.requireNonNull($.environmentIdentifier, "expected parameter 'environmentIdentifier' to be non-null");
            return $;
        }
    }

}
