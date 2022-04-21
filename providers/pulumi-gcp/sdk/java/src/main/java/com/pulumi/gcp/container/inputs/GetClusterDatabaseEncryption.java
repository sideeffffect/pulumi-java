// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterDatabaseEncryption extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDatabaseEncryption Empty = new GetClusterDatabaseEncryption();

    @Import(name="keyName", required=true)
    private String keyName;

    public String keyName() {
        return this.keyName;
    }

    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private GetClusterDatabaseEncryption() {}

    private GetClusterDatabaseEncryption(GetClusterDatabaseEncryption $) {
        this.keyName = $.keyName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterDatabaseEncryption $;

        public Builder() {
            $ = new GetClusterDatabaseEncryption();
        }

        public Builder(GetClusterDatabaseEncryption defaults) {
            $ = new GetClusterDatabaseEncryption(Objects.requireNonNull(defaults));
        }

        public Builder keyName(String keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public GetClusterDatabaseEncryption build() {
            $.keyName = Objects.requireNonNull($.keyName, "expected parameter 'keyName' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
