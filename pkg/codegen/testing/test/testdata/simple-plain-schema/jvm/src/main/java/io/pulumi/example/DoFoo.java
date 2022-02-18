// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.example.Utilities;
import io.pulumi.example.inputs.DoFooArgs;
import java.lang.Void;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class DoFoo {
    public static CompletableFuture<Void> invokeAsync(DoFooArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("example::doFoo", TypeShape.of(Void.class), args == null ? DoFooArgs.Empty : args, Utilities.withVersion(options));
    }
}
