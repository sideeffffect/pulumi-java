// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The entrypoint for the application.
 * 
 */
public final class EntrypointResponse extends com.pulumi.resources.InvokeArgs {

    public static final EntrypointResponse Empty = new EntrypointResponse();

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    @Import(name="shell", required=true)
    private String shell;

    public String shell() {
        return this.shell;
    }

    private EntrypointResponse() {}

    private EntrypointResponse(EntrypointResponse $) {
        this.shell = $.shell;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntrypointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntrypointResponse $;

        public Builder() {
            $ = new EntrypointResponse();
        }

        public Builder(EntrypointResponse defaults) {
            $ = new EntrypointResponse(Objects.requireNonNull(defaults));
        }

        public Builder shell(String shell) {
            $.shell = shell;
            return this;
        }

        public EntrypointResponse build() {
            $.shell = Objects.requireNonNull($.shell, "expected parameter 'shell' to be non-null");
            return $;
        }
    }

}
