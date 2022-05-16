// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.docdb.inputs.GetEngineVersionArgs;
import com.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs;
import com.pulumi.aws.docdb.outputs.GetEngineVersionResult;
import com.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DocdbFunctions {
    /**
     * Information about a DocumentDB engine version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getEngineVersion(GetEngineVersionArgs.builder()
     *             .version(&#34;3.6.0&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion() {
        return getEngineVersion(GetEngineVersionArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Information about a DocumentDB engine version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getEngineVersion(GetEngineVersionArgs.builder()
     *             .version(&#34;3.6.0&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion(GetEngineVersionArgs args) {
        return getEngineVersion(args, InvokeOptions.Empty);
    }
    /**
     * Information about a DocumentDB engine version.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getEngineVersion(GetEngineVersionArgs.builder()
     *             .version(&#34;3.6.0&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEngineVersionResult> getEngineVersion(GetEngineVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getEngineVersion:getEngineVersion", TypeShape.of(GetEngineVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Information about DocumentDB orderable DB instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getOrderableDbInstance(GetOrderableDbInstanceArgs.builder()
     *             .engine(&#34;docdb&#34;)
     *             .engineVersion(&#34;3.6.0&#34;)
     *             .licenseModel(&#34;na&#34;)
     *             .preferredInstanceClasses(            
     *                 &#34;db.r5.large&#34;,
     *                 &#34;db.r4.large&#34;,
     *                 &#34;db.t3.medium&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance() {
        return getOrderableDbInstance(GetOrderableDbInstanceArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Information about DocumentDB orderable DB instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getOrderableDbInstance(GetOrderableDbInstanceArgs.builder()
     *             .engine(&#34;docdb&#34;)
     *             .engineVersion(&#34;3.6.0&#34;)
     *             .licenseModel(&#34;na&#34;)
     *             .preferredInstanceClasses(            
     *                 &#34;db.r5.large&#34;,
     *                 &#34;db.r4.large&#34;,
     *                 &#34;db.t3.medium&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance(GetOrderableDbInstanceArgs args) {
        return getOrderableDbInstance(args, InvokeOptions.Empty);
    }
    /**
     * Information about DocumentDB orderable DB instances.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(DocdbFunctions.getOrderableDbInstance(GetOrderableDbInstanceArgs.builder()
     *             .engine(&#34;docdb&#34;)
     *             .engineVersion(&#34;3.6.0&#34;)
     *             .licenseModel(&#34;na&#34;)
     *             .preferredInstanceClasses(            
     *                 &#34;db.r5.large&#34;,
     *                 &#34;db.r4.large&#34;,
     *                 &#34;db.t3.medium&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOrderableDbInstanceResult> getOrderableDbInstance(GetOrderableDbInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getOrderableDbInstance:getOrderableDbInstance", TypeShape.of(GetOrderableDbInstanceResult.class), args, Utilities.withVersion(options));
    }
}
