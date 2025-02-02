// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSavedQueryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSavedQueryArgs Empty = new GetSavedQueryArgs();

    @Import(name="savedQueryId", required=true)
    private Output<String> savedQueryId;

    public Output<String> savedQueryId() {
        return this.savedQueryId;
    }

    @Import(name="v1Id", required=true)
    private Output<String> v1Id;

    public Output<String> v1Id() {
        return this.v1Id;
    }

    @Import(name="v1Id1", required=true)
    private Output<String> v1Id1;

    public Output<String> v1Id1() {
        return this.v1Id1;
    }

    private GetSavedQueryArgs() {}

    private GetSavedQueryArgs(GetSavedQueryArgs $) {
        this.savedQueryId = $.savedQueryId;
        this.v1Id = $.v1Id;
        this.v1Id1 = $.v1Id1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSavedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSavedQueryArgs $;

        public Builder() {
            $ = new GetSavedQueryArgs();
        }

        public Builder(GetSavedQueryArgs defaults) {
            $ = new GetSavedQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder savedQueryId(Output<String> savedQueryId) {
            $.savedQueryId = savedQueryId;
            return this;
        }

        public Builder savedQueryId(String savedQueryId) {
            return savedQueryId(Output.of(savedQueryId));
        }

        public Builder v1Id(Output<String> v1Id) {
            $.v1Id = v1Id;
            return this;
        }

        public Builder v1Id(String v1Id) {
            return v1Id(Output.of(v1Id));
        }

        public Builder v1Id1(Output<String> v1Id1) {
            $.v1Id1 = v1Id1;
            return this;
        }

        public Builder v1Id1(String v1Id1) {
            return v1Id1(Output.of(v1Id1));
        }

        public GetSavedQueryArgs build() {
            $.savedQueryId = Objects.requireNonNull($.savedQueryId, "expected parameter 'savedQueryId' to be non-null");
            $.v1Id = Objects.requireNonNull($.v1Id, "expected parameter 'v1Id' to be non-null");
            $.v1Id1 = Objects.requireNonNull($.v1Id1, "expected parameter 'v1Id1' to be non-null");
            return $;
        }
    }

}
